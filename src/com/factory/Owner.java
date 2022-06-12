package com.factory;

public class Owner {
    private final Vehicle vehicle;

    Owner(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        this.vehicle.start();
        System.out.println("DEBUG: Owner is driving a " + this.vehicle.getClass());
    }
}
