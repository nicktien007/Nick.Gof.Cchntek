package com.gof.strategyPattern.vehicle;

public class Truck implements IVehicle {
    @Override
    public double getBasePrice() {
        return 200;
    }
}
