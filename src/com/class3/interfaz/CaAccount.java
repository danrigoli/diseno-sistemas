package com.class3.interfaz;

public class CaAccount extends Account {

    private double commission = 0.05;

    CaAccount(double amount) {
        super(amount);
    }

    @Override
    public void transfer(Account to, int amount) throws Exception {
        if (this.getBalance() - amount < 0) throw new Exception("El monto supera la cantidad disponible");
        this.setBalance(this.getBalance() - amount);
        to.setBalance(to.getBalance() + amount * (1 - this.commission));
    }
}
