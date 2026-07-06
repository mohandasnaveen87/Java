package com.miit.facade;
// Subsystem 1
class Inventory {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        return true; // Simulating that the item is available
    }
}

// Subsystem 2
class PaymentGateway {
    public boolean chargeCustomer(double amount) {
        System.out.println("Charging customer: $" + amount);
        return true; // Simulating successful payment
    }
}

// Subsystem 3
class ShippingLogistics {
    public void shipProduct(String productId) {
        System.out.println("Product " + productId + " has been handed to courier. Tracking generated.");
    }
}