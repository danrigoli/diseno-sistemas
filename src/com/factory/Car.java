package com.factory;

public class Car implements Vehicle {

    public String brand;

    Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        seatbelt();
        System.out.println("DEBUG: Starts the car");
    }

    private void seatbelt() {
        System.out.println("DEBUG: put your seatbelts on!");
    }
}
