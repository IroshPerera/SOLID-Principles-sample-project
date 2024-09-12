package com.webmotech.Is.bad;

public class Main {
    public static void main(String[] args) {
        ReportService service = new ReportService();
        MonthlyReport report = new MonthlyReport();

        service.handleReport(report);
    }
}
