package com.flyweight;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier("Misiles", "Sniper");
        Soldier soldier1 = new Soldier("Escopeta", "Escudo");
        Tank tank = new Tank("Canon", "Agua", 100);
        Tank tank1 = new Tank("Bombas", "Autodestruccion", 0);
        System.out.println(soldier.attack());
        System.out.println(soldier1.defense());
        System.out.println(tank.defense());
        System.out.println(tank1.attack());
    }
}
