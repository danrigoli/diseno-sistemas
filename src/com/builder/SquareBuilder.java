package com.builder;

public class SquareBuilder {
    private Square square;

    SquareBuilder() {
        square = new Square();
    }

    public Square build() {
        return square;
    }

    public SquareBuilder withSize(int size) {
        square.setSize(size);
        return this;
    }
    public SquareBuilder withColor(String color) {
        square.setColor(color);
        return this;
    }
}
