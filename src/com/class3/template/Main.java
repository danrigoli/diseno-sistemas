package com.class3.template;


public class Main {

    public static void main(String[] args) {
        Account senderAccount = new CcAccount(3000);
        Account receiverAccount = new CaAccount(0);
        try {
            senderAccount.transfer(receiverAccount, 4000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Account #1: " + senderAccount.getBalance());
            System.out.println("Account #2: " + receiverAccount.getBalance());
        }
    }
}
