package com.gof.factoryMethod.iteration1.factory;

import com.gof.factoryMethod.iteration1.vehicle.IVehicle;
import com.gof.factoryMethod.iteration1.vehicle.Truck;

public class TruckFactory implements IVehicleFactory{
    @Override
    public IVehicle create() {
        return new Truck();
    }
}
