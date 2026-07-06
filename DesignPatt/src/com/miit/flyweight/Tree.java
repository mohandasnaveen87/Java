package com.miit.flyweight;

public class Tree {
    private int x; // Extrinsic
    private int y; // Extrinsic
    private TreeType type; // Reference to Flyweight

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.display(x, y);
    }
}