package com.prototype;

public class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle(String color, String texture, double width, double height) {
        super(color, texture);
        this.width = width;
        this.height = height;
    }

    Rectangle(Rectangle source) {
        super(source);
        this.width = source.getWidth();
        this.height = source.getWidth();
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
