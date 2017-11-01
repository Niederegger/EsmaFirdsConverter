package de.vv.ef.consumer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.xml.stream.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.vv.ef.gen.fulins.SecuritiesReferenceDataReport51;
import de.vv.ef.gen.dltins.SecuritiesReferenceDeltaStatusReport2Choice1;

public class Worker {
	final static Logger logger = LoggerFactory.getLogger(Worker.class);
	
	//--------------------------------------------------------------------------------------------
	//	Wrapper for parser
	//--------------------------------------------------------------------------------------------

	public static void doWork(){
		File srcFolder = new File(EFA.c.Path);
		File workFolder = BF.getFolder(srcFolder);
		if (workFolder == null) {
			logger.error("No Folder found");
			return;
		}
		workFolder = BF.markFile(workFolder);
		ArrayList<File> jobs = BF.getFiles(workFolder);
		
		// looping through all files inside one batch
		for(int i = 0; i<jobs.size();i++){
			
			EFA.srcf = jobs.get(i).getName();		// marking file as currently working	
			jobs.set(i, BF.markFile(jobs.get(i)));	// remember marked name
			ZipInputStream zipStream;
			try {
				// fetch zipped file and use its content
				zipStream = new ZipInputStream(new FileInputStream(jobs.get(i)));
				logger.info("Starting to save: {}", EFA.srcf);
				zipStream.getNextEntry();
				
				// this part takes ZipInputStream, determines whether this file
				// is a FULINS or DLTINS and extracts all valuable informations
				if(EFA.srcf.startsWith("FULINS"))
					traverseFileFULINS(new InputStreamReader(zipStream, "UTF-8"));
				else if(EFA.srcf.startsWith("DLTINS"))
					traverseFileDLTINS(new InputStreamReader(zipStream, "UTF-8"));
				else logger.error("File wasn't either FULINS nor DLTINS");
				
				logger.info("Finished to save: {}", EFA.srcf);
				
				
			} catch (IOException e) {
				logger.error("IOException: {}", e);
			} catch (XMLStreamException e) {
				logger.error("XMLStreamException: {}", e);
			} catch (JAXBException e) {
				logger.error("JAXBException: {}", e);
			}
		}
		for(File f:jobs)BF.unMarkFile(f);			// Unmark all files at the end
		workFolder = BF.unMarkFile(workFolder);		// Unmark WorkingFolder
		BF.moveFile(workFolder, 					// move WorkingFolder to Backup
				new File(EFA.c.Path + File.separator + "bak" + File.separator + workFolder.getName()));
	}
	
	
	//--------------------------------------------------------------------------------------------
	//	Actual Parser: FULINS
	//--------------------------------------------------------------------------------------------
	
	/**
	 * Use this for FULINS DATA
	 * this Function parses through an XML-File and sends all information to Database
	 * @param inputStreamReader
	 * @throws FileNotFoundException
	 * @throws XMLStreamException
	 * @throws JAXBException
	 */
	public static void traverseFileFULINS(InputStreamReader inputStreamReader) throws FileNotFoundException, XMLStreamException, JAXBException {
		String occ = "RefData";	// Referenz zum Xml-Node ab wann Daten Anfangen
		XMLInputFactory xif = XMLInputFactory.newInstance();
		XMLStreamReader xsr = xif.createXMLStreamReader(inputStreamReader);	// Stream Reader benoetigt, bedingt durch Datei-Format(alles in einer Zeile)
		
        JAXBContext jc = JAXBContext.newInstance(SecuritiesReferenceDataReport51.class);
		while(xsr.hasNext()) {		// loop durch gesammte datei

			while(xsr.hasNext()) {	// loop bis naechstes RefData Element auftaucht
	            if(xsr.isStartElement() && xsr.getLocalName().equals(occ)) {
	                break;
	            }
	            xsr.next();
	        }
			if(!xsr.hasNext())break;
			// Interpretieren einer RefData
	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        JAXBElement<SecuritiesReferenceDataReport51> jb = 
	        		unmarshaller.unmarshal(xsr, SecuritiesReferenceDataReport51.class);
	        SecuritiesReferenceDataReport51 response = jb.getValue();
	        
	        // new QC(response) wandelt ein RefData Eintrag in ein FieldName-StringValue Dictonary um,
	        // welches anschliessend an die Datenbank gesendet wird
	        DBC.executeQuery(new QC(response));	// senden der Daten an die Datenbank
		}
        DBC.executeUpdate(); 	// Aufruf des Updates MVU->MV
        xsr.close();
	}
	
	//--------------------------------------------------------------------------------------------
	//	Actual Parser: DLTINS
	//--------------------------------------------------------------------------------------------
		
	/**
	 * Use this for DLTINS DATA
	 * this Function parses through an XML-File and sends all information to Database
	 * @param inputStreamReader
	 * @throws FileNotFoundException
	 * @throws XMLStreamException
	 * @throws JAXBException
	 */
	public static void traverseFileDLTINS(InputStreamReader inputStreamReader) throws FileNotFoundException, XMLStreamException, JAXBException {
		String occ = "FinInstrm";	// Referenz zum Xml-Node ab wann Daten Anfangen
		XMLInputFactory xif = XMLInputFactory.newInstance();
		XMLStreamReader xsr = xif.createXMLStreamReader(inputStreamReader);	// Stream Reader benoetigt, bedingt durch Datei-Format(alles in einer Zeile)
		
        JAXBContext jc = JAXBContext.newInstance(SecuritiesReferenceDeltaStatusReport2Choice1.class);
		while(xsr.hasNext()) {		// loop durch gesammte datei

			while(xsr.hasNext()) {	// loop bis naechstes RefData Element auftaucht
	            if(xsr.isStartElement() && xsr.getLocalName().equals(occ)) {
	                break;
	            }
	            xsr.next();
	        }
			if(!xsr.hasNext())break;
			// Interpretieren einer RefData
	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        JAXBElement<SecuritiesReferenceDeltaStatusReport2Choice1> jb = 
	        		unmarshaller.unmarshal(xsr, SecuritiesReferenceDeltaStatusReport2Choice1.class);
	        SecuritiesReferenceDeltaStatusReport2Choice1 response = jb.getValue();
	        
	        // new QC(response) wandelt ein RefData Eintrag in ein FieldName-StringValue Dictonary um,
	        // welches anschliessend an die Datenbank gesendet wird
	        DBC.executeQuery(new QC(response));	// senden der Daten an die Datenbank
		}
        DBC.executeUpdate(); 	// Aufruf des Updates MVU->MV
        xsr.close();
	}
	
}
