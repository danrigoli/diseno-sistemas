package com.abstract_factory;

public class Application {
    private OperatingSystem operatingSystem;
    private Language language;

    public Application(ClassFactory factory) {
        operatingSystem = factory.createOperatingSystem();
        language = factory.createLanguage();
    }

    public void execute() {
        operatingSystem.boot();
        language.run();
    }
}
