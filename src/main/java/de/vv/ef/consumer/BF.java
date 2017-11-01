package de.vv.ef.consumer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BF {
	final static Logger logger = LoggerFactory.getLogger(BF.class);
	static Gson gson = new GsonBuilder().setPrettyPrinting().create();
	// --------------------------------------------------------------------------------------------------------------------
	// Config
	// --------------------------------------------------------------------------------------------------------------------

	public static boolean initConfig(String file) {
		if (!checkConfigPath(file)) { // ueberpruefe ob config exestiert
			logger.error("Invalid Config path and/or name: {}", file);
			return false;
		}

		try {
			EFA.c = gson.fromJson(new InputStreamReader(new FileInputStream(file), "UTF-8"), Config.class);
			return true;
		} catch (Exception e) {
			logger.error("Exception: {}", e.getMessage());
			return false;
		}
	}

	/**
	 * This function is used to print the Config, so one has the right format
	 */
	public static void printConfig() {
		String jsonInString = gson.toJson(EFA.c);
		logger.error(jsonInString);
		System.out.println(jsonInString);
	}

	/**
	 * Checks whether the config file has the right ending and exists or not
	 * 
	 * @param path
	 *            - path to config file
	 * @return boolean
	 */
	public static boolean checkConfigPath(String path) {
		if (path.endsWith(".conf")) {
			File f = new File(path);
			return (f.exists() && !f.isDirectory());
		}
		return false;
	}
	
	//--------------------------------------------------------------------------------------------------------------------
	// Files
	//--------------------------------------------------------------------------------------------------------------------
	
	
	/**
	 * Returns first Folder inside a path which isn't named bak and doesn't
	 * contain a tilde '~'
	 * 
	 * @param path
	 * @return
	 */
	public static File getFolder(File path) {
		for (File fileEntry : path.listFiles()) {
			String name = fileEntry.getName();
			if (fileEntry.isDirectory() && !name.equals("bak") && !name.contains("~")) {
				return fileEntry; // return first path which isn't named 'bak' and doesn't contain tilde
			}
		}
		return null;
	}

	/**
	 * Returns a List of Files inside a folder
	 * 
	 * @param folder
	 * @return
	 */
	public static ArrayList<File> getFiles(File folder) {
		ArrayList<File> ret = new ArrayList<File>();
		for (File fileEntry : folder.listFiles()) {
			if (!fileEntry.isDirectory()) {
				ret.add(fileEntry);
			}
		}
		return ret;
	}

	/**
	 * appends a tilde '~' infront of folders name
	 * 
	 * @param file
	 */
	public static File markFile(File file) {
		if (file.getName().contains("~"))
			return file;
		String[] sarr = file.getAbsolutePath().split("\\\\");
		String newName = sarr[0];
		for (int i = 1; i < sarr.length; i++) { // only appends tilde to last element in array
			newName += File.separator + (i == sarr.length - 1 ? "~" + sarr[i] : sarr[i]);
		}
		File renamedFile = new File(newName);
		moveFile(file, renamedFile);
		return renamedFile;
	}

	/**
	 * appends a tilde '~' infront of file/folders name
	 * 
	 * @param file
	 */
	public static File unMarkFile(File file) {
		if (!file.getName().contains("~"))
			return file;
		String[] sarr = file.getAbsolutePath().split("\\\\");
		String newName = sarr[0];
		for (int i = 1; i < sarr.length - 1; i++) {
			newName += File.separator + sarr[i];
		} // only replaces tilde of last element in array
		newName += File.separator + sarr[sarr.length - 1].replace("~", "");
		File renamedFile = new File(newName);
		moveFile(file, renamedFile);
		return renamedFile;
	}

	/**
	 * Moves Directory from current path to new path
	 * 
	 * @param currentPath
	 * @param newPath
	 */
	public static void moveFile(File currentPath, File newPath) {
		try {
			Files.move(currentPath.toPath(), newPath.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
