package com.gof.factoryMethod.iteration2.factory;

import com.gof.factoryMethod.iteration2.vehicle.Car;
import com.gof.factoryMethod.iteration2.vehicle.IVehicle;

public class CarFactory implements IVehicleFactory {
    @Override
    public IVehicle create() {
        return new Car();
    }
}
