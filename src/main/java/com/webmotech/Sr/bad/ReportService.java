package com.webmotech.Sr.bad;

public class ReportService {
    public void generateMonthlyReport() {
        System.out.println("Generating monthly report");
    }

    public void generateYearlyReport() {
        System.out.println("Generating yearly report");
    }

    // This method is doing more than one thing. It is generating the report and formatting it.
    public void formatReport(String reportType) {
        if (reportType.equals("Monthly")) {
            generateMonthlyReport();
        } else if (reportType.equals("Yearly")) {
            generateYearlyReport();
        }
        System.out.println("Formatting report");
    }

}
