package com.decorator;

public class CheeseDecorator extends BaseDecoratorMenuItem {

    CheeseDecorator(MenuItem decorator) {
        super(decorator);
    }

    public String getDescription() {
        return super.getDescription() + " con queso";
    }
}
