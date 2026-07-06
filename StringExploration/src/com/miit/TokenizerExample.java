package com.miit;
import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        String csvData = "Finance,Marketing,QA,Development";
        
        // Pass the string and the target delimiter
        StringTokenizer tokenizer = new StringTokenizer(csvData, ",");
        
        System.out.println("Total Tokens: " + tokenizer.countTokens());
        
        // Loop through the string dynamically
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
    }
}