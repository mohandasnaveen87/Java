package com.miit.decorator;
public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.00; // Base price + caramel cost
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Caramel";
    }
}