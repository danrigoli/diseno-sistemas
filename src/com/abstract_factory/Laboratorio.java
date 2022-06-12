package com.abstract_factory;

public class Laboratorio {
    private OperatingSystem operatingSystem;
    private Language language;

    public Laboratorio(LaboratorioAbstractFactory factory) {
        operatingSystem = factory.createOperatingSystem();
        language = factory.createLanguage();
    }

    public void execute() {
        operatingSystem.boot();
        language.run();
    }
}
