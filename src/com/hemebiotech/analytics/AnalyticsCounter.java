package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	public void analyzeSymptoms() {
		ISymptomReader symptomList = new SymptomDataFromFile("symptoms.txt");
		List<String> symptoms = new ArrayList<String>(symptomList.getSymptoms());

		SymptomCounter count = new SymptomCounter(symptoms);
		Map<String, Integer> countedSymptoms = count.countSymptoms(symptoms);

		ISymptomWriter exportFile = new SymptomDataToFile(countedSymptoms);
		exportFile.writeSymptoms();

	}
}

