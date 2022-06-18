package com.builder_old;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setColor("rojo");
        square.setSize(12);

        SquareBuilder squareBuilder = new SquareBuilder();
        squareBuilder.withColor("blue");
        squareBuilder.withColor(15);
        Square squareFromBuilder = squareBuilder.build();

        System.out.println("Square creado manualmente");
        System.out.println("Size: " + square.getSize());
        System.out.println("Color: " + square.getColor());
        System.out.println("-------------------------");

        System.out.println("Square creado del builder");
        System.out.println("Size: " + squareFromBuilder.getSize());
        System.out.println("Color: " + squareFromBuilder.getColor());
        System.out.println("-------------------------");

    }
}
