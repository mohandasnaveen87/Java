package com.miit.thread.classes;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {
    public static void main(String[] args) {
        
        // 1. Define a task that returns a value using Callable
        Callable<String> fetchTask = () -> {
            System.out.println("Fetching heavy data report via background thread...");
            Thread.sleep(2000); // Simulate network delay
            return "Data Report: Version 2026.4";
        };

        // 2. Wrap the Callable inside a FutureTask
        FutureTask<String> futureTask = new FutureTask<>(fetchTask);

        // 3. Since FutureTask IS a Runnable, we can pass it to a standard Thread
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("Main thread is free to do other work while report loads...");

        try {
            // 4. This blocks the main thread until the 2-second delay finishes!
            String result = futureTask.get(); 
            System.out.println("Success! Result received: " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Task execution failed: " + e.getMessage());
        }
    }
}