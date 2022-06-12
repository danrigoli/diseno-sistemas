package com.abstract_factory;

public interface ClassFactory {
    public Language createLanguage();
    public OperatingSystem createOperatingSystem();
}
