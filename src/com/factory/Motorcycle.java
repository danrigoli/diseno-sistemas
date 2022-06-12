package com.factory;

public class Motorcycle implements Vehicle {

    public int cylinder;

    Motorcycle(int cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public void start() {
        helmet();
        System.out.println("DEBUG: Starts the bike");
    }

    private void helmet() {
        System.out.println("DEBUG: put your helmet on!");
    }
}
