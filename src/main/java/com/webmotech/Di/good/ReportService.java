package com.webmotech.Di.good;

public class ReportService {
    private ReportFormatter formatter;
    private Report report;

    public ReportService(ReportFormatter formatter, Report report) {
        this.formatter = formatter;
        this.report = report;
    }

    public void createReport() {
        formatter.format(report);
        System.out.println("Report created successfully.");
    }
}
