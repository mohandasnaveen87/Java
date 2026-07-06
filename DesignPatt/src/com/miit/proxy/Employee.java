package com.miit.proxy;

public class Employee {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() { return name; }
    public String getDesignation() { return designation; }
}