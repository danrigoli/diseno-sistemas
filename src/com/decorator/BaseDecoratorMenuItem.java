package com.decorator;

public class BaseDecoratorMenuItem implements MenuItem {

    protected MenuItem decorator;

    BaseDecoratorMenuItem(MenuItem decorator) {
        this.decorator = decorator;
    }
    @Override
    public String getDescription() {
        return decorator.getDescription();
    }

    @Override
    public int calculate() {
        return decorator.calculate();
    }

}
