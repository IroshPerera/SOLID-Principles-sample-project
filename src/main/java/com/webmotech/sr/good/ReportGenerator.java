package com.webmotech.sr.good;

// This class is responsible for generating the report
public class ReportGenerator {
    private ReportFormatter reportFormatter;

    public ReportGenerator(ReportFormatter reportFormatter) {
        this.reportFormatter = reportFormatter;
    }

    public void generateReport(Report report) {
        reportFormatter.formatReport(report);
        System.out.println("Report generated successfully");
    }
}
