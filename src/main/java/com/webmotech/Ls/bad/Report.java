package com.webmotech.Ls.bad;

public abstract class Report {
    public abstract void generate();
    public void save() {
        System.out.println("Saving report.");
    }
}
