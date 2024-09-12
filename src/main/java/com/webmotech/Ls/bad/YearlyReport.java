package com.webmotech.Ls.bad;

public class YearlyReport extends Report {
    @Override
    public void generate() {
        System.out.println("Generating yearly performance review.");
    }
    
    // Violates LSP because it throws an exception instead of performing a save
    @Override
    public void save() {
        throw new UnsupportedOperationException("Yearly reports cannot be saved.");
    }
}
