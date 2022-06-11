package com.decorator;

public class TomatoDecorator extends BaseDecoratorMenuItem {

    TomatoDecorator(MenuItem decorator) {
        super(decorator);
    }

    public String getDescription() {
        return super.getDescription() + " con tomato";
    }
}
