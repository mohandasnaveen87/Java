package com.miit.thread.classes;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {
    private final int number;

    public SumTask(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " started calculating sum for: " + number);
        
        // Simulating a heavy computation or API call
        Thread.sleep(1500); 
        
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        
        return sum;
    }
}