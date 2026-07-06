package com.miit.Factory;
// NotificationFactory.java
public class NotificationFactory {
    
    // The factory method responsible for object creation
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SmsNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}