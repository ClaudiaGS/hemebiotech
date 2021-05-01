package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SymptomDataToFile implements ISymptomWriter {
    Map<String, Integer> symptomsFrequency = new TreeMap<String, Integer>();

    public SymptomDataToFile(Map<String, Integer> symptomsFrequency) {
        this.symptomsFrequency = symptomsFrequency;
    }

    @Override
    public void writeSymptoms() {
        BufferedWriter writer = null;
        try {
            writer=new BufferedWriter(new FileWriter("results.out"));
            for (String symptom : symptomsFrequency.keySet()) {
                writer.write(symptom + " " + String.valueOf(symptomsFrequency.get(symptom)));
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
