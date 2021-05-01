package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> symptoms=new ArrayList<String>();
        symptoms.add("tete");
        symptoms.add("ventre");
        symptoms.add("gorge");
        symptoms.add("tete");
        symptoms.add("gorge");
        symptoms.add("tete");

        AnalyticsCounter count=new AnalyticsCounter(symptoms);
        System.out.println("symptoms "+count.AnalyticsCounterMethod(symptoms));

    }
}

