package com.gof.strategyPattern.strategy;

public class TruckPriceStrategy implements IVehicleStrategy{
    @Override
    public double getDiscount(double p) {
        return p * 0.8;
    }
}
