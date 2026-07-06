package com.miit.builder;

public class Computer {
    
    // Required parameters
    private final String cpu;
    private final String ram;
    
    // Optional parameters
    private final String graphicsCard;
    private final boolean isBluetoothEnabled;
    private final boolean isWifiEnabled;

    // 1. Private constructor ensures the object can ONLY be made via the Builder
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.graphicsCard = builder.graphicsCard;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isWifiEnabled = builder.isWifiEnabled;
    }

    // 2. Getters (No setters! This makes the completed object immutable)
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getGraphicsCard() { return graphicsCard; }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled; }
    public boolean isWifiEnabled() { return isWifiEnabled; }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", GPU=" + graphicsCard 
                + ", Bluetooth=" + isBluetoothEnabled + ", Wi-Fi=" + isWifiEnabled + "]";
    }

    // 3. Static Nested Builder Class
    public static class ComputerBuilder {
        // Copy the exact same fields
        private final String cpu;
        private final String ram;
        private String graphicsCard;
        private boolean isBluetoothEnabled;
        private boolean isWifiEnabled;

        // Builder constructor enforces the MANDATORY fields
        public ComputerBuilder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // Fluent setter-like methods that return 'this' (the builder instance)
        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this; // Crucial for method chaining
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setWifiEnabled(boolean isWifiEnabled) {
            this.isWifiEnabled = isWifiEnabled;
            return this;
        }

        // The build method that finally compiles the actual Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}