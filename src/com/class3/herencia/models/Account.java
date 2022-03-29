package com.class3.herencia.models;

public abstract class Account {

    private final int commission;
    private final int negative;
    private int balance;

    Account(int amount, int negative, int commission) {
        this.balance = amount;
        this.negative = negative;
        this.commission = commission;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

    public int getCommission() {
        return commission;
    }

    public void transfer(Account to, int amount) throws Exception {
        if (this.balance - amount < -this.negative) throw new Exception("El monto supera la cantidad disponible");
        this.balance = this.balance - amount;
        to.setBalance(to.getBalance() + amount * (100 - to.getCommission()) / 100);
    }

}
