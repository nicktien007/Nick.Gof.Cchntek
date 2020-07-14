package com.gof.abstractFactory.factory;

import com.gof.abstractFactory.airTransport.IAirTransport;
import com.gof.abstractFactory.vehicle.IVehicle;

public interface IOEMFactory {
    IVehicle createVehicle();

    IAirTransport createAirTransport();
}
