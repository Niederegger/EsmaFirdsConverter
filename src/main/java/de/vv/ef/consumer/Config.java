package de.vv.ef.consumer;

public class Config {
	// DB Attributes
	public String user 		 = "TestUser"; 				// User zum arbeiten mit der SQL Datenbnak
	public String pw 	 	 = "TestUser"; 				// das Password des Users
	public String serverName = "ACER-2016\\SQLEXPRESS"; // Der Server-Name des SQL-Servers
	public String dbName 	 = "MasterData"; 			// Der DatenBank Name
	public int    port 		 = 1433; 					// der Port ueber welchen der Zugriff gestattet ist
	
	//DataOrigin
	public String daor = "ESMA: Financial Instruments Reference Files";
	//SrcId
	public String srid = "ESMFIRDS";
	//Comment
	public String cmmt = "ESMFIRDS Comment";
	//UrlSource
	public String urls = "https://registers.esma.europa.eu/publication/searchRegister?core=esma_registers_firds_files";

	// path of Storage
	public String Path = "";
	
	public String[][] mappings = {
			{"AsstClssSpcfcAttrbts","ACSA"},
			{"OthrLegIntrstRate","OLIR"},
			{"DerivInstrmAttrbts","DIA"},
			{"Cmmdty","C"},
			{"Pdct","P"},
	};
}
