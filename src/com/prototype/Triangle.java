package com.prototype;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;


    Triangle(String name, Paint paint, double sideA, double sideB, double sideC) {
        super(name, paint);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public Triangle clone() {
        return new Triangle(
            this.getName(),
            new Paint(this.getPaint().getColor(), this.getPaint().getTexture()),
            this.getSideA(),
            this.getSideB(),
            this.getSideC()
        );
    }


    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
