package com.flyweight;

public class Tank {

    private final TankFly fly;

    private String attackingWeapon;
    private String defensiveWeapon;
    private int health;

    Tank(String attackingWeapon, String defensiveWeapon, int extraHealth) {
        this.attackingWeapon = attackingWeapon;
        this.defensiveWeapon = defensiveWeapon;
        this.fly = (TankFly) UnitFlyFactory.getFly("Tank");
        this.health = this.fly.getTotalHealth() + extraHealth;

    }

    public void attack() {
        this.fly.attack(attackingWeapon);
        this.health -= 20;
    }

    public void defense() {
        this.fly.defend(defensiveWeapon);
        this.health -= 10;
    }

    public String getAttackingWeapon() {
        return attackingWeapon;
    }

    public void setAttackingWeapon(String attackingWeapon) {
        this.attackingWeapon = attackingWeapon;
    }

    public String getDefensiveWeapon() {
        return defensiveWeapon;
    }

    public void setDefensiveWeapon(String defensiveWeapon) {
        this.defensiveWeapon = defensiveWeapon;
    }

}