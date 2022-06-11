package com.flyweight;

public class Soldier {

    private final SoldierFly fly;

    private String attackingWeapon;
    private String defensiveWeapon;

    Soldier(String attackingWeapon, String defensiveWeapon) {
        this.attackingWeapon = attackingWeapon;
        this.defensiveWeapon = defensiveWeapon;
        this.fly = (SoldierFly) UnitFlyFactory.getFly("Soldier");
    }

    public void attack() {
        this.fly.attack(attackingWeapon);
    }

    public void defense() {
        this.fly.defend(defensiveWeapon);
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
