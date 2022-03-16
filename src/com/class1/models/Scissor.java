package com.class1.models;

public class Scissor extends Figure {
    private static Scissor instance = new Scissor();

    Scissor() {
        super(Paper.getInstance());
    }

    public static Scissor getInstance() {
        return instance;
    }

}
