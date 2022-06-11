package com.flyweight;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier("Misiles", "Sniper");
        Soldier soldier1 = new Soldier("Escopeta", "Escudo");
        Tank tank = new Tank("Canon", "Agua", 100);
        Tank tank1 = new Tank("Bombas", "Autodestruccion", 0);
        soldier.attack();
        soldier1.defense();
        tank.attack();
        tank1.defense();
    }
}
