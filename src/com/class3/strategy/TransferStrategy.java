package com.class3.strategy;

public interface TransferStrategy {
    public void transfer(Account to, int amount) throws Exception;
}
