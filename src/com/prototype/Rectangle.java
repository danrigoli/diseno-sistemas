package com.prototype;

public class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle(String name, Paint paint, double width, double height) {
        super(name, paint);
        this.width = width;
        this.height = height;
    }


    @Override
    public Rectangle clone() {
        return new Rectangle(
                this.getName(),
                new Paint(this.getPaint().getColor(), this.getPaint().getTexture()),
                this.getWidth(),
                this.getHeight()
        );
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
