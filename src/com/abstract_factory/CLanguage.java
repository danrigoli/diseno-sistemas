package com.abstract_factory;

public class CLanguage implements Language {
    private final String NAME = "C";


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void run() {
        System.out.println("DEBUG: running program in C");
    }
}
