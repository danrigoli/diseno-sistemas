package com.adapter;

public class SquareShapeAdapter {

    public static RoundShape transform(SquareShape squareShape) {
        return new RoundShape(squareShape.getWidth() * Math.sqrt(2) / 2);
    }
}
