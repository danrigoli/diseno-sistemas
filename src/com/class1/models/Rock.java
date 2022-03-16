package com.class1.models;

public class Rock extends Figure {
    private static Rock instance = new Rock();

    Rock() {
        super(Scissor.getInstance());
    }

    public static Rock getInstance() {
        return instance;
    }

}