package com.factory;

public class VehicleFactory {

    private static VehicleFactory instance;

    private VehicleFactory() {}

    public static VehicleFactory getInstance() {
        if (VehicleFactory.instance == null) {
            VehicleFactory.instance = new VehicleFactory();
        }
        return VehicleFactory.instance;
    }

    public Car createCar(String brand) {
        return new Car(brand);
    }

    public Motorcycle createMotorcycle(int cylinder) {
        return new Motorcycle(cylinder);
    }
}
