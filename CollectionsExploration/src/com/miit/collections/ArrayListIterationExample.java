package com.miit.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationExample {

    public static void main(String[] args) {

        // Create an ArrayList of 10 million integers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }

        // Measure execution time of for loop
        long startTime1 = System.nanoTime();
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
        }
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        System.out.println("For loop execution time: " + duration1 + " nanoseconds.");

        // Measure execution time of iterator
        Iterator<Integer> iterator = numbers.iterator();
        long startTime2 = System.nanoTime();
        while (iterator.hasNext()) {
            int num = iterator.next();
        }
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        System.out.println("Iterator execution time: " + duration2 + " nanoseconds.");
    }

}