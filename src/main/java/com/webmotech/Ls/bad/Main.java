package com.webmotech.Ls.bad;

public class Main {
    public static void main(String[] args) {
        Report monthlyReport = new MonthlyReport();
        Report yearlyReport = new YearlyReport();

        monthlyReport.generate();
        monthlyReport.save();

        yearlyReport.generate();
        yearlyReport.save();  // This will throw an exception
    }
}
