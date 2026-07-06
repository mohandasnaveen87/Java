package com.miit.decorator;
// Milk Decorator
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.50; // Base price + milk cost
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}

// Caramel Decorator
