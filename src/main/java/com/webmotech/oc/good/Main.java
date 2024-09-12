package com.webmotech.oc.good;


public class Main {
    public static void main(String[] args) {
        ReportFormatter formatter = new ReportFormatter();
        ReportGenerator generator = new ReportGenerator(formatter);

        Report monthlyReport = new MonthlyReport();
        Report yearlyReport = new YearlyReport();

        generator.generateReport(monthlyReport);
        generator.generateReport(yearlyReport);
    }
}
