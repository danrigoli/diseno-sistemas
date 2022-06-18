package com.prototype;

public class Circle extends Shape {

    private double radius;

    Circle(String name, Paint paint, double radius) {
        super(name, paint);
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        return new Circle(
                this.getName(),
                new Paint(this.getPaint().getColor(), this.getPaint().getTexture()),
                this.getRadius()
        );
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
