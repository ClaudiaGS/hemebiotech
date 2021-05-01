package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SymptomDataFromFile implements ISymptomReader {
	private String filePath;

	public SymptomDataFromFile(String filePath) {
		this.filePath = filePath;
	}

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
