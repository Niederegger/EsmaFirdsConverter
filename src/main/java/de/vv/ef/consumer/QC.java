package de.vv.ef.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.vv.ef.gen.dltins.SecuritiesReferenceDeltaStatusReport2Choice1;

/**
 * gilt als Query Container,
 * dient als Stump zum senden an die Datenbank
 */
public class QC {
	final static Logger logger = LoggerFactory.getLogger(QC.class);
	public String isin;
	public String mic;
	public L2M data = new L2M();

	public QC() {}

	public QC(de.vv.ef.gen.fulins.SecuritiesReferenceDataReport51 in) {
		isin = in.getFinInstrmGnlAttrbts().getId();
		mic = in.getTradgVnRltdAttrbts().getId();
		try
        {
			data = in.getData();
        } catch (Exception e){
        	logger.error("Exception: {}", e);
        }
	}
	
	public QC(SecuritiesReferenceDeltaStatusReport2Choice1 in) {
		de.vv.ef.gen.dltins.SecuritiesReferenceDataReport51 rep = null;
		if(in.getNewRcrd()!=null){
			rep = in.getNewRcrd();
		} else if(in.getModfdRcrd()!=null){
			rep = in.getModfdRcrd();
		} 
		// ignore terminated Values
//		else if(in.getTermntdRcrd()!=null){		
//			rep = in.getTermntdRcrd();
//		} 
		if(rep==null)return;
		isin = rep.getFinInstrmGnlAttrbts().getId();
		mic = rep.getTradgVnRltdAttrbts().getId();
		try
        {
			data = rep.getData();
        } catch (Exception e){
        	logger.error("Exception: {}", e);
        }
	}

}
