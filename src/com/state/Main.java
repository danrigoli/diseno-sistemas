package com.state;

public class Main {

    public static void main(String[] args) {
        Contract contract = new Contract("Test");

        System.out.println("This should return null because contract is not confirmed: " + contract.read());
        contract.edit("Hello World!");
        contract.confirm();
        System.out.println("This should work because it is confirmed: " + contract.read());
        contract.edit("This won't work...");
        System.out.println("The information should stay the same because it is not in editing state: " + contract.read());
        contract.close();
        contract.edit("This won't work either");
        System.out.println("This should return null because contract is closed: " + contract.read());

        System.out.println("\n ______________________________________________________ \n");

        Contract secondContract = new Contract("Test");

        System.out.println("This should return null because contract is not confirmed: " + secondContract.read());
        secondContract.confirm();
        System.out.println("The info should say Test: " + secondContract.read());
        secondContract.edit("This won't work...");
        System.out.println("The information should stay the same because it is not in editing state: " + secondContract.read());
        secondContract.close();
        secondContract.edit("This won't work either");
        System.out.println("This should return null because contract is closed: " + secondContract.read());

    }
}
