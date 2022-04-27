package com.class3.template_method;

public class CaAccount extends Account {

    private double commission = 0.05;


    @Override
    protected void removeFromAccount(double amount) throws Exception{
        if (this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
        } else {
            throw new Exception("No tiene el saldo disponible");
        }
    }

    @Override
    protected void addToAccount(double amount) {
        this.setBalance(this.getBalance() + amount * (1 - commission));
    }

    CaAccount(double amount) {
        super(amount);
    }


}
