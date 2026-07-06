package com.miit;
public class Main {
    public static void main(String[] args) {
        CricketBat bat1 = new CricketBat("SS", 2.8);
        CricketBat bat2 = new CricketBat("SS", 2.8);
        CricketBat bat3 = bat1;

        // Reference Comparison (==)
        System.out.println(bat1 == bat2);      // Prints: false (Different memory spots on the heap)
        System.out.println(bat1 == bat3);      // Prints: true  (Points to the exact same object reference)

        // Logical Content Comparison (.equals)
        System.out.println(bat1.equals(bat2)); // Prints: true  (Brand and weight match perfectly!)
    }
}