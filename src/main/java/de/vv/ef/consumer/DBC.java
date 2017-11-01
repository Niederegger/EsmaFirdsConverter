package de.vv.ef.consumer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class DBC {
	final static Logger logger = LoggerFactory.getLogger(DBC.class);

	static Connection con;
	static SQLServerDataSource ds;
	static PreparedStatement psi = null; // insert
	static PreparedStatement psu = null; // update
	final static String queryI = "INSERT INTO vv_mastervalues_upload"
			+ "(MVU_DATA_ORIGIN, MVU_SOURCEFILE, MVU_SOURCE_ID, MVU_ISIN, MVU_MIC, MVU_FIELDNAME, MVU_STRINGVALUE, MVU_COMMENT) VALUES"
			+ "(?,?,?,?,?,?,?,?);";
	final static String queryU = "exec vvsp_import_uploadV3 ?, ?, ?, ?, ?;";

	/**
	 * opens Connection to Database
	 */
	public static void open() {
		try {
			ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(false);
			ds.setUser(EFA.c.user);
			ds.setPassword(EFA.c.pw);
			ds.setServerName(EFA.c.serverName);
			ds.setPortNumber(EFA.c.port);
			ds.setDatabaseName(EFA.c.dbName);
			con = ds.getConnection();
			psi = con.prepareStatement(queryI);
			psu = con.prepareStatement(queryU);
		} catch (SQLException e) {
			logger.error("SQLException: {}", e.getMessage());
			System.err.println(e.getMessage());
		}
	}

	/**
	 * closes Connection to Database
	 */
	public static void close() {
		try {
			con.close();
		} catch (SQLException e) {
			logger.error("SQLException: {}", e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Wrapper for Query to Database
	 * @param c
	 */
	public static void executeQuery(QC c) {
		executeQuery(c.isin, c.mic, c.data);
	}

	/**
	 * unwrapping Wrapper for Query to Database
	 * @param isin
	 * @param mic
	 * @param d
	 */
	private static void executeQuery(String isin, String mic, L2M d) {
		try {
			for (int i = 0; i < d.fns.size(); i++)
				executeQuery(isin, mic, d.fns.get(i), d.svs.get(i));
		} catch (SQLException e) {
			logger.error("SQLException: {}", e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * plain query Function to Database
	 * @param isin
	 * @param mic
	 * @param fn
	 * @param sv
	 * @throws SQLException
	 */
	private static void executeQuery(String isin, String mic, String fn, String sv) throws SQLException {
		int stmtCount = 1;
		String wMic = fn.contains("TradgVnRltdAttrbts") ? mic : "";
		psi.setString(stmtCount++, EFA.c.daor); // DataOrigin
		psi.setString(stmtCount++, EFA.srcf); // SourceFile
		psi.setString(stmtCount++, EFA.c.srid); // entries.sourceId);
		psi.setString(stmtCount++, isin); // ISIN
		psi.setString(stmtCount++, wMic); // entry.MIC);
		psi.setString(stmtCount++, fn); // FieldName
		psi.setString(stmtCount++, sv); // StringValue
		psi.setString(stmtCount++, EFA.c.cmmt); // entries.comment);
		psi.executeUpdate();
	}

	/**
	 * Executing UpdateFuntion of Database
	 */
	public static void executeUpdate() {
		int stmtCount = 1;
		try {
			psu.setString(stmtCount++, EFA.c.srid); // SourceId
			psu.setString(stmtCount++, EFA.c.daor); // Data Origin
			psu.setString(stmtCount++, EFA.c.urls); // UrlSource
			psu.setString(stmtCount++, EFA.srcf); // Filename
			psu.setString(stmtCount++, EFA.c.cmmt); // Comment
			psu.executeUpdate();
		} catch (SQLException e) {
			logger.error("SQLException: {}", e.getMessage());
			e.printStackTrace();
		}
	}
}
