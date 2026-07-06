package com.miit.flyweight;

// Intrinsic State: These details are identical for every "Oak" or "Pine"
public class TreeType {
    private String name;
    private String color;
    private String textureData; // Imagine this is a heavy 3D graphic asset

    public TreeType(String name, String color, String textureData) {
        this.name = name;
        this.color = color;
        this.textureData = textureData;
    }

    // Extrinsic state (X, Y) is passed in as an argument at runtime
    public void display(int x, int y) {
        System.out.println("Rendering " + name + " [" + color + "] at coordinates (" + x + ", " + y + ")");
    }
}