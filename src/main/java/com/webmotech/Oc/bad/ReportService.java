package com.webmotech.Oc.bad;

public class ReportService {
    public void generateReport(String type) {
        if (type.equals("Monthly")) {
            System.out.println("Generating monthly report");
        } else if (type.equals("Yearly")) {
            System.out.println("Generating yearly report");
        } else {
            System.out.println("Invalid report type");
        }
    }

    public void formatReport(String type) {
        generateReport(type);
        System.out.println("Formatting report");
    }
}
