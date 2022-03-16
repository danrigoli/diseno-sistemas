package com.class1.models;

public class Paper extends Figure {
    private static Paper instance = new Paper();

    Paper() {
        super(Rock.getInstance());
    }

    public static Paper getInstance() {
        return instance;
    }

}