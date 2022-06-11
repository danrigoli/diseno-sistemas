package com.flyweight;

import java.util.HashMap;

public class UnitFlyFactory {

    private static HashMap<String, UnitFly> unitMap = new HashMap<String, UnitFly>();

    public static UnitFly getFly(String type) {

        UnitFly unitFly = null;
        if (unitMap.containsKey(type)) unitFly = unitMap.get(type);
        else {
            switch (type) {
                case "Soldier":
                    System.out.println("DEBUG: getting a soldierFly");
                    unitFly = new SoldierFly();
                    break;
                case "Tank":
                    System.out.println("DEBUG: getting a tankFly");
                    unitFly = new TankFly();
            }
            unitMap.put(type, unitFly);
        }
        return unitFly;
    }
}
