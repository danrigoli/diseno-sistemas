package com.abstract_factory;

public class LinuxOperatingSystem implements OperatingSystem {
    private final String NAME = "Linux";


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void boot() {
        System.out.println("DEBUG: booting Linux OS");
    }
}
