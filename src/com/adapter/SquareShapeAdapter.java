package com.adapter;

public class SquareShapeAdapter extends RoundShape {
    private final SquareShape squareShape;

    SquareShapeAdapter(SquareShape squareShape) {
        super(squareShape.getWidth() * Math.sqrt(2) / 2);
        this.squareShape = squareShape;
    }

    public double getRadius() {
        return squareShape.getWidth() * Math.sqrt(2) / 2;
    }
}
