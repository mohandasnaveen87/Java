package com.miit.thread.classes;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {
	
	public static void main(String[] args) {
    ExecutorService threadPool = Executors.newFixedThreadPool(3);
    
    // Wrap the thread pool inside the CompletionService
    ExecutorCompletionService<String> completionService = 
            new ExecutorCompletionService<>(threadPool);

    // Submit 3 tasks with different execution times
    completionService.submit(() -> { Thread.sleep(3000); return "Task A (3s)"; });
    completionService.submit(() -> { Thread.sleep(1000); return "Task B (1s)"; });
    completionService.submit(() -> { Thread.sleep(2000); return "Task C (2s)"; });

    System.out.println("Tasks submitted. Gathering results...");

    try {
        for (int i = 0; i < 3; i++) {
            // .take() blocks until ANY task in the pool completes
            Future<String> completedFuture = completionService.take(); 
            String result = completedFuture.get();
            System.out.println("Received: " + result);
        }
    } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
    } finally {
        threadPool.shutdown();
    }}

}