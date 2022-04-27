package com.class3.template_method;

public class CcAccount extends Account {

    private double negative = 3000;

    @Override
    protected void removeFromAccount(double amount) throws Exception{
        if (this.getBalance() + negative > amount) {
            this.setBalance(this.getBalance() - amount);
        } else {
            throw new Exception("No tiene el saldo disponible");
        }
    }

    @Override
    protected void addToAccount(double amount) {
        this.setBalance(getBalance() + amount);
    }

    CcAccount(double amount) {
        super(amount);
    }

}

