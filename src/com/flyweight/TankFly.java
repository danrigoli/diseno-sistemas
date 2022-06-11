package com.flyweight;

public class TankFly implements UnitFly {

    private final int TOTAL_HEALTH;

    public TankFly() {
        TOTAL_HEALTH = 1000;
    }

    @Override
    public void attack(String weapon) {
        System.out.println("DEBUG: A TANK ATTACKED WITH " + weapon);
    }

    @Override
    public void defend(String weapon) {
        System.out.println("DEBUG: A TANK DEFENDED WITH " + weapon);

    }

    @Override
    public int getTotalHealth() {
        return this.TOTAL_HEALTH;
    }

}
