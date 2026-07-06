package com.miit;
public class UncheckedExceptionExample {  
    public static void main(String[] args) {  
        // Example 1: NullPointerException  
        String str = null;  
        try {  
            System.out.println(str.length()); // May throw NullPointerException  
        } catch (NullPointerException e) {  
            System.out.println("Caught NullPointerException: " + e.getMessage());  
        }  
  
        // Example 2: ArrayIndexOutOfBoundsException  
        int[] arr = {1, 2, 3};  
        try {  
            System.out.println(arr[5]); // Invalid index  
        } catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());  
        }  
  
        // Example 3: ArithmeticException  
        try {  
            int result = 10 / 0; // Division by zero  
        } catch (ArithmeticException e) {  
            System.out.println("Caught ArithmeticException: " + e.getMessage());  
        }  
    }  
}  