package com.webmotech.Is.bad;

public class MonthlyReport implements Reportable {
    @Override
    public void print() {
        System.out.println("Printing monthly sales report.");
    }

    @Override
    public void export() {
        System.out.println("Exporting monthly sales report.");
    }
}
