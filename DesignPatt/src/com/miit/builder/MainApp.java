package com.miit.builder;

public class MainApp {
    public static void main(String[] args) {
        
        // Constructing a high-end gaming PC step-by-step
        Computer gamingPc = new Computer.ComputerBuilder("AMD Ryzen 9", "32GB")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setBluetoothEnabled(true)
                .setWifiEnabled(true)
                .build(); // Finalizes creation

        // Constructing a basic office server with zero optional features
        Computer officeServer = new Computer.ComputerBuilder("Intel Xeon", "64GB")
                .build();

        System.out.println(gamingPc);
        System.out.println(officeServer);
    }
}