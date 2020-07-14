package com.gof.factoryMethod.iteration1.factory;

import com.gof.factoryMethod.iteration1.vehicle.Car;
import com.gof.factoryMethod.iteration1.vehicle.IVehicle;

public class CarFactory implements IVehicleFactory{
    @Override
    public IVehicle create() {
        return new Car();
    }
}
