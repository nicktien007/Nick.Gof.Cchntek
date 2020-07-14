package com.gof.simpleFactory;

import com.gof.simpleFactory.enums.VehicleType;
import com.gof.simpleFactory.vehicle.*;

public class VehicleFactory {

    public static IVehicle create(VehicleType type){
        switch (type) {
            case Car:
                return new Car();
            case Truck:
                return new Truck();
            case MotorCycle:
                return new MotorCycle();
            default:
                return null;
        }
    }
}
