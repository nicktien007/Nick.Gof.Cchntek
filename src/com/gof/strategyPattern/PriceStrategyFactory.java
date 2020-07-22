package com.gof.strategyPattern;

import com.gof.strategyPattern.strategy.CarPriceStrategy;
import com.gof.strategyPattern.strategy.IVehicleStrategy;
import com.gof.strategyPattern.strategy.TruckPriceStrategy;
import com.gof.strategyPattern.vehicle.Car;
import com.gof.strategyPattern.vehicle.IVehicle;

/**
 * 策略工廠
 */
public class PriceStrategyFactory {
   public static IVehicleStrategy getStrategy(IVehicle v) {
       return v.getClass().equals(Car.class)
               ? new CarPriceStrategy()
               : new TruckPriceStrategy();
    }
}
