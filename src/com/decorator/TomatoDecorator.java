package com.decorator;

public class TomatoDecorator extends BaseDecoratorMenuItem {

    TomatoDecorator(MenuItem decorator) {
        super(decorator);
    }

    public String getDescription() {
        return super.getDescription() + " con tomate";
    }

    public int calculate() {
        return super.calculate() + 20;
    }
}
