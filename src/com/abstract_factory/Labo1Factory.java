package com.abstract_factory;

public class Labo1Factory implements ClassFactory {

    @Override
    public Language createLanguage() {
        return new JavaLanguage();
    }

    @Override
    public OperatingSystem createOperatingSystem() {
        return new WinOperatingSystem();
    }
}
