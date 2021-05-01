package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Count symptoms from list and put data in map
 * @author Claudia
 */
public interface ISymptomCounter {

    /**
     * Count symptom occurrence and put data in a map
     * @param symptomsList a list of symptoms
     * @return a map with symptoms and occurrence
     */
    Map countSymptoms(List<String> symptomsList);
}
