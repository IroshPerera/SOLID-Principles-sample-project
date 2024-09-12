package com.webmotech.Ls.good;

public class Main {
    public static void main(String[] args) {
        Report monthlyReport = new MonthlyReport();
        Report yearlyReport = new YearlyReport();

        monthlyReport.generate();
        yearlyReport.generate();
    }
}
