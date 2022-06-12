package com.abstract_factory;

public class Main {
    public static void main(String[] args) {
        Labo1Factory labo1Factory = new Labo1Factory();
        Labo3Factory labo3Factory = new Labo3Factory();
        Application labo1App = new Application(labo1Factory);
        Application labo3App = new Application(labo3Factory);

        System.out.println("Should print Linux/C");
        labo3App.execute();
        System.out.println("--------------------------");
        System.out.println("Should print Windows/Java");
        labo1App.execute();
    }
}
