package com.builder_old;

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

    public void setSize(int size) {
        square.setSize(size);
    }

    public String getColor() {
        return square.getColor();
    }

    public void setColor(String color) {
        square.setColor(color);
    }}
