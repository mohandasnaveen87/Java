package com.miit.Factory;
// SmsNotification.java
public class SmsNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}