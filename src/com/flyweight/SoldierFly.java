package com.flyweight;

public class SoldierFly implements UnitFly {

    private final int TOTAL_HEALTH;


    public SoldierFly() {
        TOTAL_HEALTH = 100;
    }

    @Override
    public String attack(String weapon) {
        return "A SOLDIER ATTACKED WITH " + weapon;
    }

    @Override
    public String defend(String weapon) {
        return "A SOLDIER DEFENDED WITH " + weapon;
    }

    @Override
    public int getTotalHealth() {
        return this.TOTAL_HEALTH;
    }

}