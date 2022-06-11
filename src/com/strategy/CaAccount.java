package com.strategy;

public class CaAccount implements TransferStrategy {

    private double commission = 0.05;
    private double balance;

    CaAccount(double amount) {
        balance = amount;
    }

    @Override
    public void transfer(TransferStrategy to, int amount) throws Exception {
        if (this.getBalance() - amount < 0) throw new Exception("El monto supera la cantidad disponible");
        this.setBalance(this.getBalance() - amount);
        to.setBalance(to.getBalance() + amount * (1 - this.commission));
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}
