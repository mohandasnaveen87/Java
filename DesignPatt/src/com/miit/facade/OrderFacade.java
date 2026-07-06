package com.miit.facade;
public class OrderFacade {
    private final Inventory inventory;
    private final PaymentGateway paymentGateway;
    private final ShippingLogistics shippingLogistics;

    // Constructor initializes the subsystems
    public OrderFacade() {
        this.inventory = new Inventory();
        this.paymentGateway = new PaymentGateway();
        this.shippingLogistics = new ShippingLogistics();
    }

    // The simplified method for the client
    public boolean placeOrder(String productId, double price) {
        System.out.println("--- Starting Order Process ---");
        
        if (!inventory.checkStock(productId)) {
            System.out.println("Order Failed: Item out of stock.");
            return false;
        }
        
        if (!paymentGateway.chargeCustomer(price)) {
            System.out.println("Order Failed: Payment declined.");
            return false;
        }
        
        shippingLogistics.shipProduct(productId);
        System.out.println("--- Order Successfully Completed! ---\n");
        return true;
    }
}