package com.state_singleton;

public class Main {

    public static void main(String[] args) {
        Contract contract = new Contract("Info" +
                "");

        System.out.println("This should return null because contract is not confirmed: " + contract.read());
        System.out.println(contract.getState());
        contract.edit("Hello World!");
        System.out.println(contract.getState());
        contract.confirm();
        System.out.println(contract.getState());
        System.out.println("This should work because it is confirmed: " + contract.read());
        contract.edit("This won't work...");
        System.out.println("The information should stay the same because it is not in editing state: " + contract.read());
        contract.close();
        System.out.println(contract.getState());
        contract.edit("This won't work either");
        System.out.println("This should return info because contract is closed: " + contract.read());

        System.out.println("\n ______________________________________________________ \n");

    }
}
