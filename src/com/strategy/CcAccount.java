package com.strategy;

public class CcAccount implements TransferStrategy {

    private double negative = 3000;
    private double balance;


    CcAccount(double amount) {
        balance = amount;
    }

    @Override
    public void transfer(TransferStrategy to, int amount) throws Exception {
        if (this.getBalance() - amount + 3000 < 0) throw new Exception("El monto supera la cantidad disponible");
        this.setBalance(this.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}

