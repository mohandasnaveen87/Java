package com.miit.decorator;
public class Main {
    public static void main(String[] args) {
        // 1. Start with plain coffee
        Coffee myOrder = new SimpleCoffee();
        // 2. Wrap it with Milk
        myOrder = new MilkDecorator(myOrder);
        
        // 3. Wrap it again with Caramel
        //myOrder = new CaramelDecorator(myOrder);
        
        // Print final results
        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Total Cost: $" + myOrder.getCost());
    }
}