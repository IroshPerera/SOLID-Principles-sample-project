package com.webmotech.Is.good;

public class MonthlyReport implements Printable, Exportable {
    @Override
    public void print() {
        System.out.println("Printing monthly sales report.");
    }

    @Override
    public void export() {
        System.out.println("Exporting monthly sales report.");
    }
}
