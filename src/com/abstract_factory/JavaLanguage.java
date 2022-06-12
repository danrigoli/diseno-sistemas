package com.abstract_factory;

public class JavaLanguage implements Language {
    private final String NAME = "Java";


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void run() {
        System.out.println("DEBUG: running program in Java");
    }
}
