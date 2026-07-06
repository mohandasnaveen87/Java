package com.miit.facade;
public class Main {
    public static void main(String[] args) {
        // The client only needs to know about the Facade
        OrderFacade orderProcessor = new OrderFacade();
        
        // One simple method call handles everything behind the scenes
        orderProcessor.placeOrder("Java-Book-101", 45.99);
    }
}