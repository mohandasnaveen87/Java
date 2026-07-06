package com.miit;

public class Fibo {

    public static void main(String[] args) {
        int terms = 10;
        System.out.print("Fibonacci Series (" + terms + " terms): ");
        
        // Loop from 1 to 10 and print each calculated term
        for (int i = 1; i <= terms; i++) {
            System.out.print(getFiboTerm(i) + " ");
        }
    }

    // This method's ONLY job is to calculate the single number at position i
    private static int getFiboTerm(int i) {
        // Base Case 1: The 1st term is always 0
        if (i == 1) {
            return 0;
        }
        // Base Case 2: The 2nd term is always 1
        else if (i == 2) {
            return 1;
        }
        // Recursive Case: Use the incoming parameter 'i' to branch down!
        else {
            return getFiboTerm(i - 2) + getFiboTerm(i - 1);
        } 
    }//getFiboTerm(4)=getFiboTerm(2)+getFiboTerm(3)
}