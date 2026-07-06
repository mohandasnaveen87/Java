package com.miit.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ForestSimulation {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();

        // Plant 1,000,000 trees, but only create TWO TreeType objects in memory!
        for (int i = 0; i < 500000; i++) {
            TreeType oak = TreeFactory.getTreeType("Oak", "Green", "heavy_oak_mesh.png");
            forest.add(new Tree(i * 2, i * 3, oak));

            TreeType pine = TreeFactory.getTreeType("Pine", "Dark Green", "heavy_pine_mesh.png");
            forest.add(new Tree(i * 5, i * 7, pine));
        }

        // Render a couple of examples
        forest.get(0).draw();
        forest.get(1).draw();
        
        System.out.println("\nTotal individual tree instances simulated: " + forest.size());
    }
}