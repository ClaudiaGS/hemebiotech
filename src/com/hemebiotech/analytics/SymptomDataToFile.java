package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

/**
 * Writes data to file
 * <p>This class helps sending data from Map to output file</p> *
 *
 * @author Claudia
 */
public class SymptomDataToFile implements ISymptomWriter {
    Map<String, Integer> symptomsFrequency = new TreeMap<String, Integer>();

    /**
     * Constructor
     *
     * @param symptomsFrequency is a TreeMap with symptoms(String) and their occurrence
     */
    public SymptomDataToFile(Map<String, Integer> symptomsFrequency) {
        this.symptomsFrequency = symptomsFrequency;
    }

    /**
     * @see ISymptomWriter#writeSymptoms()
     */
    @Override
    public void writeSymptoms() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("results.out"));
            for (String symptom : symptomsFrequency.keySet()) {
                writer.write(symptom + " " + String.valueOf(symptomsFrequency.get(symptom)));
                writer.write("\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
