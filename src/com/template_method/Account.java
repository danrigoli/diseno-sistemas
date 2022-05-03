package com.template_method;

public abstract class Account {
    private double balance;

    protected abstract void removeFromAccount(double amount) throws Exception;
    protected abstract void addToAccount(double amount);

    Account(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transfer(Account to, double amount) throws Exception{
        this.removeFromAccount(amount);
        to.addToAccount(amount);
    }

}
