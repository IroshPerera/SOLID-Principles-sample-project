package com.webmotech.Di.good;

public class Main {
    public static void main(String[] args) {
        ReportFormatter formatter = new ReportFormatter();
        Report report = new MonthlyReport();
        ReportService service = new ReportService(formatter, report);

        service.createReport();
    }
}
