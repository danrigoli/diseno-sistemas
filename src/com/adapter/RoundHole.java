package com.adapter;

public class RoundHole {

    private double radius;

    RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fitsInHole(RoundShape shape) {
        return this.getRadius() >= shape.getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
