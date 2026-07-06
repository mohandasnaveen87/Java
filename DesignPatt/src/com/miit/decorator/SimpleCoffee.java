package com.miit.decorator;
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 5.00; // Base price
    }

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }
    public String getSugar() {
        return "Plain Coffee";
    }
}