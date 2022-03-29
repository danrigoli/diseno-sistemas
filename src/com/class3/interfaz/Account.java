package com.class3.interfaz;

public abstract class Account implements TransferStrategy {
    private double balance;

    Account(double amount) {
        this.balance = amount;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

}
