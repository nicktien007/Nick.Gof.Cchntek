package com.gof.factoryMethod.iteration2.factory;

import com.gof.factoryMethod.iteration2.vehicle.IVehicle;
import com.gof.factoryMethod.iteration2.vehicle.Truck;

public class TruckFactory implements IVehicleFactory {
    @Override
    public IVehicle create() {
        return new Truck();
    }
}
