package com.gof.strategyPattern.vehicle;

public class Car implements IVehicle {
    @Override
    public double getBasePrice() {
        return 100;
    }
}
