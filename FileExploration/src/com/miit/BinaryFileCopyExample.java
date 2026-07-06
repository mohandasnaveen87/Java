package com.miit;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileCopyExample {
    public static void main(String[] args) {
        String sourceImage = "linkedin.jpg";
        String destinationImage = "backup_profile.jpg";

        // Try-with-resources automatically closes the streams in the correct order!
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceImage));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationImage))
        ) {
            int byteData;
            // Reading chunks from RAM buffer, checking for End-of-File (-1)
            while ((byteData = bis.read()) != -1) {
                // Writing to RAM buffer
                bos.write(byteData); 
            }
            
            // Final flush is implicitly handled when BufferedOutputStream closes!
            System.out.println("Binary file copied successfully using memory buffers.");
            
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }
    }
}