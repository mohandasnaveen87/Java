package com.miit.decorator;
public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee decoratedCoffee; // The wrapped object

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}