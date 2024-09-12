package com.webmotech.Sr.good;

// This class is a concrete implementation of the Report interface
// It generates a monthly report

public class MonthlyReport implements Report{
    @Override
    public void generate() {
        System.out.println("Generating monthly report");
    }
}
