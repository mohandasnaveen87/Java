package com.miit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOPerformanceTest {

    public static void main(String[] args) {
        String fileName = "performance_test_log.txt";
        generateDummyLogFile(fileName); // Creates a ~5MB text file

        System.out.println("--- Starting IO Execution Time Test --- \n");

        // Test 1: Raw FileReader (No Buffer)
        long startTimeRaw = System.currentTimeMillis();
        readWithRawFileReader(fileName);
        long endTimeRaw = System.currentTimeMillis();
        System.out.println("Raw FileReader Execution Time: " + (endTimeRaw - startTimeRaw) + " ms\n");

        // Test 2: Buffered Reader (With Memory Buffer)
        long startTimeBuffered = System.currentTimeMillis();
        readWithBufferedReader(fileName);
        long endTimeBuffered = System.currentTimeMillis();
        System.out.println("BufferedReader Execution Time: " + (endTimeBuffered - startTimeBuffered) + " ms");
    }

    // 1. Reading character-by-character directly from the disk drive
    private static void readWithRawFileReader(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            while ((character = reader.read()) != -1) {
                // Simulating processing by just reading the character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2. Reading chunks of text into RAM first, then reading from memory
    private static void readWithBufferedReader(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Simulating processing by just reading the line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to set up a dummy 5MB file for testing
    private static void generateDummyLogFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (int i = 0; i < 100000; i++) {
                writer.write("2026-06-24 21:12:54 [INFO] AuthenticationService - User login attempt successful for session account data.\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}