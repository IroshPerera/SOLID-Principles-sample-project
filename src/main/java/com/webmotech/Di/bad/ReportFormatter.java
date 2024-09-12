package com.webmotech.Di.bad;

public class ReportFormatter {
    public void format(MonthlyReport report) {
        System.out.println("Formatting report.");
        report.generate();
    }
}
