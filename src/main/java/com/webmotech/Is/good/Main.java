package com.webmotech.Is.good;

public class Main {
    public static void main(String[] args) {
        MonthlyReport report = new MonthlyReport();
        ReportPrinter printer = new ReportPrinter();
        ReportExporter exporter = new ReportExporter();

        printer.print(report);
        exporter.export(report);
    }
}
