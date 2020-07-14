package com.gof.simpleFactory;


import com.gof.simpleFactory.enums.VehicleType;
import com.gof.simpleFactory.vehicle.IVehicle;

public class MainForSimpleFactory {

    public static void main(String[] args) {
        IVehicle vehicle = VehicleFactory.create(VehicleType.MotorCycle);

        vehicle.design();
        vehicle.create();
    }
}
