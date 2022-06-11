package com.strategy;

public interface TransferStrategy {

    double getBalance();

    void setBalance(double amount);

    public void transfer(TransferStrategy to, int amount) throws Exception;
}
