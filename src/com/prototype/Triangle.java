package com.prototype;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;


    Triangle(String color, String texture, double sideA, double sideB, double sideC) {
        super(color, texture);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    Triangle(Triangle source) {
        super(source);
        this.sideA = source.getSideA();
        this.sideB = source.getSideB();
        this.sideC = source.getSideC();
    }


    @Override
    public Triangle clone() {
        return new Triangle(this);
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
