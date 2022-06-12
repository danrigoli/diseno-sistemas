package com.decorator;

public class BaconDecorator extends BaseDecoratorMenuItem {

    BaconDecorator(MenuItem decorator) {
        super(decorator);
    }

    public String getDescription() {
        return super.getDescription() + " con bacon";
    }

    public int calculate() {
        return super.calculate() + 100;
    }
}
