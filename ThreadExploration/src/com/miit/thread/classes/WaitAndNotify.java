package com.miit.thread.classes;
class Restaurant {  
    boolean foodReady = false;  
  
    synchronized void prepareFood() {  
        System.out.println("Cook is preparing food...");  
        foodReady = true;  
        notify(); // Notify waiting customer  
    }  
  
    synchronized void serveFood() {  
        while (!foodReady) {  
            try {  
                System.out.println("Customer is waiting for food...");  
                wait(); // Customer waits  
            } catch (InterruptedException e) {  
                System.out.println(e);  
            }  
        }  
        System.out.println("Customer is served food.");  
    }  
}  
  
public class WaitAndNotify {  
    public static void main(String[] args) {  
        Restaurant restaurant = new Restaurant();  
  
        Thread customer = new Thread(() -> restaurant.serveFood());  
        Thread cook = new Thread(() -> restaurant.prepareFood());  
  
        customer.start();  
        cook.start();  
    }   
} 