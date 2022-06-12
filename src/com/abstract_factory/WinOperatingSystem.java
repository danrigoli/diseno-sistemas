package com.abstract_factory;

public class WinOperatingSystem implements OperatingSystem {
    private final String NAME = "Windows";


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void boot() {
        System.out.println("DEBUG: booting Windows OS");
    }
}
