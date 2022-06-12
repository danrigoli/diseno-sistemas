package com.abstract_factory;

public class CFactory implements LaboratorioAbstractFactory {

    @Override
    public Language createLanguage() {
        return new CLanguage();
    }

    @Override
    public OperatingSystem createOperatingSystem() {
        return new LinuxOperatingSystem();
    }
}
