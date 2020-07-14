package com.gof.factoryMethod.iteration1.vehicle;

public class Truck implements IVehicle{
    @Override
    public void design() {
        System.out.println("Design [Truck]");
    }

    @Override
    public void create() {
        System.out.println("Create [Truck]");
    }
}
