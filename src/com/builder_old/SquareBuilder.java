package com.builder_old;

public class SquareBuilder {
    private Square square;

    SquareBuilder() {
        square = new Square();
    }

    public Square build() {
        return square;
    }

    public void withColor(int size) {
        square.setSize(size);
    }

    public void withColor(String color) {
        square.setColor(color);
    }}
