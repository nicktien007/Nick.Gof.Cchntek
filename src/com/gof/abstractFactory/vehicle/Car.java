package com.gof.abstractFactory.vehicle;

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
