package com.gof.strategyPattern;


import com.gof.strategyPattern.strategy.IVehicleStrategy;
import com.gof.strategyPattern.vehicle.Car;
import com.gof.strategyPattern.vehicle.IVehicle;
import com.gof.strategyPattern.vehicle.Truck;

import java.util.ArrayList;
import java.util.List;

public class MainForStrategy {

    public static void main(String[] args) {

        List<IVehicle> list = getList();

        int total = 0;
        VehiclePrice vehiclePrice = new VehiclePrice();
        for (IVehicle v : list) {

            IVehicleStrategy strategy = PriceStrategyFactory.getStrategy(v);
            vehiclePrice.setStrategy(strategy);

            total += vehiclePrice.getDiscount(v.getBasePrice());
        }

        System.out.println(total);
    }

    private static List<IVehicle> getList(){
        List<IVehicle> list = new ArrayList<>();
        list.add(new Car());
        list.add(new Truck());
        list.add(new Car());
        list.add(new Truck());

        return list;
    }
}
