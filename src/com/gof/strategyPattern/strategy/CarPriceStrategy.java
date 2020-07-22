package com.gof.strategyPattern.strategy;

public class CarPriceStrategy implements IVehicleStrategy {
    @Override
    public double getDiscount(double p) {
        return p * 0.9;
    }
}
