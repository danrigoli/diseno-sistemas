package com.adapter;

public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(12);
        RoundShape roundShape = new RoundShape(12);
        RoundShape roundShape2 = new RoundShape(13);
        SquareShape squareShape = new SquareShape(10);
        System.out.println("round shape in round hole with a radius of 12 should return true: " + roundHole.fitsInHole(roundShape));
        System.out.println("square shape (width 10) in round hole with a radius of 12 should return true: " + roundHole.fitsInHole(SquareShapeAdapter.transform(squareShape)));
        System.out.println("round shape in round hole with a radius of 13 should return false: " + roundHole.fitsInHole(roundShape2));
//        roundHole.fitsInHole(squareShape); THIS THROWS COMPILATION ERROR

    }

}