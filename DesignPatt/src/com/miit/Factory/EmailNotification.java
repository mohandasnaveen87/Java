package com.miit.Factory;
// EmailNotification.java
public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}