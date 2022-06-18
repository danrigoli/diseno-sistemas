package com.flyweight;

public class TankFly implements UnitFly {

    private final int TOTAL_HEALTH;

    public TankFly() {
        TOTAL_HEALTH = 1000;
    }

    @Override
    public String attack(String weapon) {
        return "A TANK ATTACKED WITH " + weapon;
    }

    @Override
    public String defend(String weapon) {
        return "A TANK DEFENDED WITH " + weapon;
    }

    @Override
    public int getTotalHealth() {
        return this.TOTAL_HEALTH;
    }

}
