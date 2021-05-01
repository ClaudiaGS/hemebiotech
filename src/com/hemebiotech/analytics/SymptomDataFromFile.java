package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads data from file
 * <p>This class helps reading data from file and puts it in a list</p> *
 * @author Claudia
 */
public class SymptomDataFromFile implements ISymptomReader {
	private String filePath;

	/**
	 * Constructor
	 * @param filePath is a full or partial path to file with String symptoms in it, one per line
	 */
	public SymptomDataFromFile(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @see ISymptomReader#getSymptoms()
	 */
	@Override
	public List<String> getSymptoms() {
		List<String> result = new ArrayList<String>();
		BufferedReader reader = null;
		if (filePath != null) {
			try {
				reader=new BufferedReader (new FileReader(filePath));
				String line = reader.readLine();
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					reader.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

}
