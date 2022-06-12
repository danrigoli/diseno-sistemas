package com.factory;

public class Main {

    public static void main(String[] args) {
        VehicleFactory vf = VehicleFactory.getInstance();

        Owner carlos = new Owner(vf.createCar("Audi"));
        Owner juan = new Owner(vf.createMotorcycle(450));

        System.out.println("Carlos drives");
        carlos.drive();

        System.out.println("Juan drives");
        juan.drive();
    }

}
