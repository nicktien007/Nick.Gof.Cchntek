package com.gof.factoryMethod.iteration1;

import com.gof.factoryMethod.iteration1.factory.CarFactory;
import com.gof.factoryMethod.iteration1.factory.IVehicleFactory;
import com.gof.factoryMethod.iteration1.factory.TruckFactory;
import com.gof.factoryMethod.iteration1.vehicle.IVehicle;

public class MainForFactoryMethod1 {

    public static void main(String[] args) {
        //car
        //IVehicleFactory factory = new CarFactory();
        //truck
        IVehicleFactory factory = new TruckFactory();
        IVehicle vehicle = factory.create();

        vehicle.design();
        vehicle.create();

    }
}
