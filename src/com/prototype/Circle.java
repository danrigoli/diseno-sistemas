package com.prototype;

public class Circle extends Shape {

    private double radius;

    Circle(String color, String texture, double radius) {
        super(color, texture);
        this.radius = radius;
    }

    Circle(Circle source) {
        super(source);
        this.radius = source.getRadius();
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
