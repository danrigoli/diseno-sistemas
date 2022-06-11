package com.decorator;

public class Main {
    public static void main(String[] args) {
        MenuItem burger = new CheeseDecorator(new BaconDecorator(new Burger()));
        MenuItem salad = new TomatoDecorator(new CheeseDecorator(new Salad()));
        System.out.println(burger.getDescription());
        System.out.println(salad.getDescription());

    }
}
