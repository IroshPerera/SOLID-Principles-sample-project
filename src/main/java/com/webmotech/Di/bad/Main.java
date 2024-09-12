package com.webmotech.Di.bad;

public class Main {
    public static void main(String[] args) {
        ReportFormatter formatter = new ReportFormatter();
        MonthlyReport report = new MonthlyReport();

        formatter.format(report);
    }
}
