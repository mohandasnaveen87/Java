package com.miit.thread.classes;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExample {
    public static void main(String[] args) {
        // Create the single thread executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit 3 tasks
        for (int i = 1; i <= 3; i++) {
            final int taskId = i;
            executor.execute(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task " + taskId + " running on " + threadName);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                System.out.println("Task " + taskId + " finished.");
            });
        }

        // Always shutdown the executor when done
        executor.shutdown();
    }
}