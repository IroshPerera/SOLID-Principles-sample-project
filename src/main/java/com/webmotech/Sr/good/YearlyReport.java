package com.webmotech.Sr.good;

//This is a concrete implementation of the Report interface
//It generates a yearly report
public class YearlyReport implements Report{

    @Override
    public void generate() {
        System.out.println("Generating yearly report");
    }
}
