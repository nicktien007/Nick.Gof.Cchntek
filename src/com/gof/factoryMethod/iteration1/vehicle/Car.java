package com.gof.factoryMethod.iteration1.vehicle;

public class Car implements IVehicle {
    @Override
    public void design() {
        System.out.println("Design [Car]");
    }

    @Override
    public void create() {
        System.out.println("Create [Car]");
    }
}
