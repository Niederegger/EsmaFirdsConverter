package de.vv.ef.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EFA {
	final static Logger logger = LoggerFactory.getLogger(EFA.class);
	public static Config c;			// Config 
	public static String srcf;		// Current Used SourceFile
	
	public static void main(String[] args) {
		if(!init(args))return;

		DBC.open();			// establish Connection to Database
		Worker.doWork();	// Work through first Folder which can be found
		DBC.close();		// close Connection to Database
	}
	
	
	/**
	 * initializing of this Programm, 
	 * simply fetches Config, and checks whether it's valid
	 * @param args
	 * @return
	 */
	public static boolean init(String[] args){
		if(args.length==1){
			if(BF.initConfig(args[0]))
				return true;
		} else {
			System.err.println("Enter Config Path as only argument.");
			logger.error("Invalid args.length: {} != 1", args.length);
			return false;
		}
		System.err.println("Invalid Config");
		logger.error("Invalid Config");
		return false;
	}
	
}
