package com.gof.abstractFactory.factory;

import com.gof.abstractFactory.airTransport.Helicopter;
import com.gof.abstractFactory.airTransport.IAirTransport;
import com.gof.abstractFactory.vehicle.IVehicle;
import com.gof.abstractFactory.vehicle.Truck;

public class BOEMFactory implements IOEMFactory{
    @Override
    public IVehicle createVehicle() {
        return new Truck();
    }

    @Override
    public IAirTransport createAirTransport() {
        return new Helicopter();
    }
}
