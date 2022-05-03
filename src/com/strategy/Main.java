package com.strategy;


public class Main {

    public static void main(String[] args) {
        Account senderAccount = new CaAccount(3000);
        Account receiverAccount = new CcAccount(0);
        try {
            senderAccount.transfer(receiverAccount, 3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Account #1: " + senderAccount.getBalance());
            System.out.println("Account #2: " + receiverAccount.getBalance());
        }
    }
}
