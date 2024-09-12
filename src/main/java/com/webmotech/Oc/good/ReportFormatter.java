package com.webmotech.Oc.good;

public class ReportFormatter {
    public void format(Report report) {
        System.out.println("Formatting report.");
        report.generate();
    }
}
