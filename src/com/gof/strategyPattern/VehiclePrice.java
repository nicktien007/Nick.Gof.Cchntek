package com.gof.strategyPattern;

import com.gof.strategyPattern.strategy.IVehicleStrategy;

/**
 * context
 */
public class VehiclePrice {
    public IVehicleStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IVehicleStrategy strategy) {
        this.strategy = strategy;
    }

    private IVehicleStrategy strategy;

    public double getDiscount(double p){
        return strategy.getDiscount(p);
    }
}
