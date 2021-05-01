package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	List<String> symptomsList = new ArrayList<String>();
	public AnalyticsCounter(List<String> symptomsList) {
		this.symptomsList = symptomsList;
	}
	//count method
	public Map AnalyticsCounterMethod(List<String> symptomsList){
		symptomsList=this.symptomsList;
		Map<String, Integer> symptomsFrequency = new TreeMap<String, Integer>();
		for(String currentSymptom:symptomsList){
			if(!symptomsFrequency.containsKey(currentSymptom)){
				symptomsFrequency.put(currentSymptom,0);
				for(String symptom:symptomsList){
					if(currentSymptom.equals(symptom)){
						symptomsFrequency.put(currentSymptom,symptomsFrequency.get(currentSymptom)+1);
					}
				}
			}
		}return symptomsFrequency;
	}
}

