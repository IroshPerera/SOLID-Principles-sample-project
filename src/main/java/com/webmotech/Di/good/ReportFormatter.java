package com.webmotech.Di.good;

public class ReportFormatter {
    public void format(Report report) {
        System.out.println("Formatting report.");
        report.generate();
    }
}
