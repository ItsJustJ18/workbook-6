package com.pluralsight.asset;

public class Jewelry {
    private double karat;
    String name;

    public Jewelry(double karat, String name) {
        this.karat = karat;
        this.name = name;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
