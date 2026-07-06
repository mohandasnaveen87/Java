package com.miit.thread.classes;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledPoolExample {
    public static void main(String[] args) {
        // Create a scheduled pool with 2 core threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Task 1: Run once after an initial delay of 3 seconds
        scheduler.schedule(() -> {
            System.out.println("Delayed Task executed!");
        }, 3, TimeUnit.SECONDS);

        // Task 2: Run repeatedly every 5 seconds, starting immediately
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Fixed Rate Task: Checking system health...");
        }, 0, 5, TimeUnit.SECONDS);
        
        // Note: Keep the scheduler running for background tasks. 
        // Do not call scheduler.shutdown() immediately or tasks will be canceled.
    }
}