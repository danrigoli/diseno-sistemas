package com.class3.herencia;

import com.class3.herencia.models.Ca;
import com.class3.herencia.models.Cc;

public class Main {

    public static void main(String[] args) {
        var account1 = new Ca(0);
        var account2 = new Cc(1000);

        try {
            account2.transfer(account1, 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Account #1: " + account1.getBalance());
            System.out.println("Account #2: " + account2.getBalance());
        }
    }
}
