package com.builder;

public class SquareBuilder {
    private Square square;

    SquareBuilder() {
        square = new Square();
    }

    public Square build() {
        return square;
    }

    public int getSize() {
        return square.getSize();
    }

    public SquareBuilder setSize(int size) {
        square.setSize(size);
        return this;
    }

    public String getColor() {
        return square.getColor();
    }

    public SquareBuilder setColor(String color) {
        square.setColor(color);
        return this;
    }
}
