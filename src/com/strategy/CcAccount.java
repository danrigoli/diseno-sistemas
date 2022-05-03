package com.strategy;

public class CcAccount extends Account {

    private double negative = 3000;

    CcAccount(double amount) {
        super(amount);
    }

    @Override
    public void transfer(Account to, int amount) throws Exception {
        if (this.getBalance() - amount + 3000 < 0) throw new Exception("El monto supera la cantidad disponible");
        this.setBalance(this.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
    }
}

