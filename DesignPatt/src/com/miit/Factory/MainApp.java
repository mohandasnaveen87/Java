package com.miit.Factory;
// MainApp.java
public class MainApp {
    public static void main(String[] args) {
        String userPreference = "email"; // This could come from a config file or database
        
        // The client code never uses the 'new' keyword for concrete classes!
        Notification notification = NotificationFactory.createNotification(userPreference);
        
        // Execute the behavior seamlessly
        if (notification != null) {
            notification.sendNotification("Your OTP is 1234");
        }
    }
}