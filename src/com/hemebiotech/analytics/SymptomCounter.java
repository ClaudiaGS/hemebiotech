package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Helps counting the occurrence of each symptom in a list
 *
 * @author Claudia
 */
public class SymptomCounter implements ISymptomCounter {
    List<String> symptomsList = new ArrayList<String>();

    /**
     * Constructor
     *
     * @param symptomsList is a list with symptoms, as String, one per line
     */
    public SymptomCounter(List<String> symptomsList) {
        this.symptomsList = symptomsList;
    }

    /**
     * @see ISymptomCounter #countSymptoms()
     */
    @Override
    public Map countSymptoms(List<String> symptomsList) {
        Map<String, Integer> symptomsFrequency = new TreeMap<String, Integer>();
        for (String currentSymptom : symptomsList) {
            String currentSymptomFinal=currentSymptom.trim().toLowerCase();
            if (!symptomsFrequency.containsKey(currentSymptomFinal)) {
                symptomsFrequency.put(currentSymptomFinal, 1);
            }
            else {
                symptomsFrequency.put(currentSymptomFinal, symptomsFrequency.get(currentSymptomFinal) + 1);
            }
        }
        return symptomsFrequency;
    }
}


