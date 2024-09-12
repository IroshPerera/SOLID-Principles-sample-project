package com.webmotech.sr.good;

// This class is responsible for formatting the report
public class ReportFormatter {
    public void formatReport(Report report) {
        System.out.println("Formatting report");
        report.generate();
    }
}
