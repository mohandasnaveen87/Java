package com.miit;
import java.util.Objects;

public class CricketBat {
    private String brand;
    private double weightInLbs;

    public CricketBat(String brand, double weightInLbs) {
        this.brand = brand;
        this.weightInLbs = weightInLbs;
    }

    // 1. Overriding the equals method
    @Override
    public boolean equals(Object obj) {
        // Step 1: Check if the object is compared with itself
        if (this == obj) {
            return true;
        }

        // Step 2: Check if the passed object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Step 3: Downcast the object to our specific class
        CricketBat otherBat = (CricketBat) obj;

        // Step 4: Compare individual fields for logical equality
        return Double.compare(otherBat.weightInLbs, this.weightInLbs) == 0 &&
               Objects.equals(this.brand, otherBat.brand);
    }

    // 2. Overriding the hashCode method to match the equals logic
    @Override
    public int hashCode() {
        return Objects.hash(brand, weightInLbs);
    }
}