package com.abstract_factory;

public class Main {
    public static void main(String[] args) {
        JavaFactory javaFactory = new JavaFactory();
        CFactory cFactory = new CFactory();
        Laboratorio labo1 = new Laboratorio(javaFactory);
        Laboratorio labo3 = new Laboratorio(cFactory);

        System.out.println("Should print Linux/C");
        labo3.execute();
        System.out.println("--------------------------");
        System.out.println("Should print Windows/Java");
        labo1.execute();
    }
}
