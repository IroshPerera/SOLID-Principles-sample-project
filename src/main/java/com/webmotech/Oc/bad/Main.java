package com.webmotech.Oc.bad;

public class Main {
    public static void main(String[] args) {
        ReportService service = new ReportService();

        service.formatReport("Monthly");
        service.formatReport("Yearly");
    }
}
