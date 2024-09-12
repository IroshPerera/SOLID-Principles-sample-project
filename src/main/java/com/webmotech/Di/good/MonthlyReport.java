package com.webmotech.Di.good;

public class MonthlyReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating monthly sales report.");
    }
}
