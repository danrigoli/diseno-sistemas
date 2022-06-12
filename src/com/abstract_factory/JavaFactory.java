package com.abstract_factory;

public class JavaFactory implements LaboratorioAbstractFactory {

    @Override
    public Language createLanguage() {
        return new JavaLanguage();
    }

    @Override
    public OperatingSystem createOperatingSystem() {
        return new WinOperatingSystem();
    }
}
