package com.decorator;

public class CheeseDecorator extends BaseDecoratorMenuItem {

    CheeseDecorator(MenuItem decorator) {
        super(decorator);
    }

    public String getDescription() {
        return super.getDescription() + " con queso";
    }

    public int calculate() {
        return super.calculate() + 10;
    }
}
