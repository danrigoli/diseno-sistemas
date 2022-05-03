package com.state;

public class Main {

    public static void main(String[] args) {
        Contract contract = Contract.getInstance();

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
        System.out.println("This should return null because contract is closed: " + contract.read());

        System.out.println("\n ______________________________________________________ \n");

        Contract secondContract = Contract.getInstance(); // mismo objeto que el de arriba
        System.out.println("Current state: " + secondContract.getState());
        secondContract.edit("Hello World!"); // this won't do anything because it is already closed
        secondContract.confirm();
        secondContract.edit("This won't work");
        System.out.println("This should return null because contract is closed: " + secondContract.read());

    }
}
