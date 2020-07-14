package com.gof.abstractFactory.factory;

import com.gof.abstractFactory.airTransport.Airplane;
import com.gof.abstractFactory.vehicle.Car;
import com.gof.abstractFactory.airTransport.IAirTransport;
import com.gof.abstractFactory.vehicle.IVehicle;

public class AOEMFactory implements IOEMFactory{
    @Override
    public IVehicle createVehicle() {
        return new Car();
    }

    @Override
    public IAirTransport createAirTransport() {
        return new Airplane();
    }
}
