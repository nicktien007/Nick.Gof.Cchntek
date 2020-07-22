package com.gof.strategyPattern.strategy;

public class NoDiscountStrategy  implements  IVehicleStrategy{
    @Override
    public double getDiscount(double p) {
        return p;
    }
}
