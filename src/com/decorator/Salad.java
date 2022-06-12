package com.decorator;

public class Salad implements MenuItem {

    @Override
    public String getDescription() {
        return "Ensalada";
    }

    @Override
    public int calculate() {
        return 50;
    }

}
