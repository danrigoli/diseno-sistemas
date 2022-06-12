package com.abstract_factory;

public class Labo3Factory implements ClassFactory {

    @Override
    public Language createLanguage() {
        return new CLanguage();
    }

    @Override
    public OperatingSystem createOperatingSystem() {
        return new LinuxOperatingSystem();
    }
}
