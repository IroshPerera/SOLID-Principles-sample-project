package com.webmotech.oc.good;

public class ReportGenerator {
    private ReportFormatter formatter;

    public ReportGenerator(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public void generateReport(Report report) {
        formatter.format(report);
        System.out.println("Report generated successfully.");
    }
}
