package com.webmotech.sr.good;


public class Main {
    public static void main(String[] args) {
        // Create a report formatter and a report generator
        ReportFormatter formatter = new ReportFormatter();
        ReportGenerator generator = new ReportGenerator(formatter);

        // Create a monthly and yearly report
        Report monthlyReport = new MonthlyReport();
        Report yearlyReport = new YearlyReport();

        // Generate the reports
        generator.generateReport(monthlyReport);
        generator.generateReport(yearlyReport);
    }
}
