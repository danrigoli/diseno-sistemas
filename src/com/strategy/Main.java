package com.strategy;


public class Main {

    public static void main(String[] args) {
        TransferStrategy senderAccount = new CaAccount(3000);
        TransferStrategy receiverAccount = new CcAccount(0);
        try {
            senderAccount.transfer(receiverAccount, 3000);
            senderAccount.transfer(receiverAccount, 2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Account #1: " + senderAccount.getBalance());
            System.out.println("Account #2: " + receiverAccount.getBalance());
        }
    }
}
