package com.miit.thread.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MainCallablePool {
    public static void main(String[] args) {
        // Create a fixed pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        // Keep track of the Future receipts
        List<Future<Integer>> futureList = new ArrayList<>();

        System.out.println("--- Submitting Tasks ---");
        for (int i = 1; i <= 5; i++) {
            Callable<Integer> task = new SumTask(i * 10); // Summing up to 10, 20, 30, 40, 50
            
            // submit() accepts Callable and returns a Future
            Future<Integer> future = executor.submit(task);
            futureList.add(future);
        }

        System.out.println("--- Processing Results ---");
        // Iterate over the receipts to get the results
        for (int i = 0; i < futureList.size(); i++) {
            Future<Integer> future = futureList.get(i);
            try {
                // .get() is a BLOCKING call. It waits until the thread finishes.
                Integer result = future.get();
                System.out.println("Result of Task " + (i + 1) + " = " + result);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                System.err.println("Task failed with exception: " + e.getCause());
            }
        }

        // Clean shutdown
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
        System.out.println("All tasks finished processing.");
    }
}