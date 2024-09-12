package com.webmotech.Ls.bad;

public class MonthlyReport extends Report {
    @Override
    public void generate() {
        System.out.println("Generating monthly sales report.");
    }

    @Override
    public void save() {
        System.out.println("Saving monthly report to database.");
    }
}
