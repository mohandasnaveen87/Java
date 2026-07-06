package com.miit.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String textureData) {
        // If we already created this type of tree, return the cached copy
        if (!treeTypes.containsKey(name)) {
            treeTypes.put(name, new TreeType(name, color, textureData));
            System.out.println("Creating NEW TreeType object for: " + name);
        }
        return treeTypes.get(name);
    }
}