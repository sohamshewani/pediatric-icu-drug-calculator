package com.example.drugcalculator;

public class Dose {
    private double amount;
    private String unit;
    private Drug drug;

    public Dose(double amount, String unit, Drug drug) {
        this.amount = amount;
        this.unit = unit;
        this.drug = drug;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public Drug getDrug() {
        return drug;
    }

    @Override
    public String toString() {
        return drug.getName() + " (" + amount + " 