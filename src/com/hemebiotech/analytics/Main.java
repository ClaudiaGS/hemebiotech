package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ISymptomReader symptomList = new ReadSymptomDataFromFile("symptoms.txt");
        List<String>symptoms1=new ArrayList<String>(symptomList.GetSymptoms());
        System.out.println("symptoms read " + symptoms1);
        AnalyticsCounter count1 = new AnalyticsCounter(symptomList.GetSymptoms());
        System.out.println("symptoms counted " + count1.AnalyticsCounterMethod(symptoms1));
        System.out.println("\n");
        ExportSymptomFrequencyFromMap exportFile = new ExportSymptomFrequencyFromMap(count1.AnalyticsCounterMethod(symptoms1));
        exportFile.export();


    }
}

