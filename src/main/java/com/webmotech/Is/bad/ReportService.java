package com.webmotech.Is.bad;

public class ReportService {
    public void handleReport(Reportable report) {
        report.print();
        report.export();
    }
}
