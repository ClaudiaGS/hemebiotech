package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	List<String> symptomsList = new ArrayList<String>();

	public AnalyticsCounter(List<String> symptomsList) {
		this.symptomsList = symptomsList;
	}

	public Map AnalyticsCounter(List<String> symptomsList) {

		Map<String, Integer> symptomsFrequency = new HashMap<String, Integer>();
		int index = 0;
		String currentSymptom = symptomsList.get(index);
		int count = 0;

		while (index < symptomsList.size() - 1) {
			if (symptomsFrequency.containsKey(currentSymptom) == false) {
				for (int i = 0; i < symptomsList.size(); i++) {
					if (symptomsList.get(i) == currentSymptom) {
						count += 1;
						symptomsFrequency.put(currentSymptom, count);
					}
				}
			}
			count = 0;
			index += 1;
			currentSymptom = symptomsList.get(index);
		}
		return symptomsFrequency;


	}


}

