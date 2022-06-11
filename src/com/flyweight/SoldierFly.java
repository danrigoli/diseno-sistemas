package com.flyweight;

public class SoldierFly implements UnitFly {

    private final int TOTAL_HEALTH;


    public SoldierFly() {
        TOTAL_HEALTH = 100;
    }

    @Override
    public void attack(String weapon) {
        System.out.println("DEBUG: A SOLDIER ATTACKED WITH " + weapon);
    }

    @Override
    public void defend(String weapon) {
        System.out.println("DEBUG: A SOLDIER DEFENDED WITH " + weapon);
    }

    @Override
    public int getTotalHealth() {
        return this.TOTAL_HEALTH;
    }

}