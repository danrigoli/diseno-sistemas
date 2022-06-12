package com.decorator;

public class Burger implements MenuItem {

    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public int calculate() {
        return 150;
    }

}
