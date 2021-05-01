package com.hemebiotech.analytics;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class ExportSymptomFrequencyFromMap {
    Map<String, Integer> symptomsFrequency = new TreeMap<String, Integer>();

    public ExportSymptomFrequencyFromMap(Map<String, Integer> symptomsFrequency) {
        this.symptomsFrequency = symptomsFrequency;
    }

    public void export()  {
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
