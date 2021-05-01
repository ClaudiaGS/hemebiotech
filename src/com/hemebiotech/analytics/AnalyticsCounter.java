package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Results of symptoms analysis
 * @author Claudia
 */
public class AnalyticsCounter {

	/**
	 * Calls all the methods needed to symptoms occurrence analysis
	 */
	public void analyzeSymptoms() {
		ISymptomReader symptomList = new SymptomDataFromFile("symptoms.txt");
		List<String> symptoms = new ArrayList<String>(symptomList.getSymptoms());

		SymptomCounter count = new SymptomCounter(symptoms);
		Map<String, Integer> countedSymptoms = count.countSymptoms(symptoms);

		ISymptomWriter exportFile = new SymptomDataToFile(countedSymptoms);
		exportFile.writeSymptoms();

	}
}

