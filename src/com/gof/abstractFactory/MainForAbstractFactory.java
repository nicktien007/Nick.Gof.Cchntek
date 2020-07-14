package com.gof.abstractFactory;

import com.gof.abstractFactory.airTransport.IAirTransport;
import com.gof.abstractFactory.factory.AOEMFactory;
import com.gof.abstractFactory.factory.BOEMFactory;
import com.gof.abstractFactory.factory.IOEMFactory;
import com.gof.abstractFactory.vehicle.IVehicle;

public class MainForAbstractFactory {

    public static void main(String[] args) {

        IOEMFactory factoryA = new AOEMFactory();
        IVehicle vehicleA = factoryA.createVehicle();
        IAirTransport airTransportA = factoryA.createAirTransport();

        vehicleA.design();
        vehicleA.create();

        airTransportA.design();
        airTransportA.create();

        IOEMFactory factoryB = new BOEMFactory();
        IVehicle vehicleB = factoryB.createVehicle();
        IAirTransport airTransportB = factoryB.createAirTransport();

        vehicleB.design();
        vehicleB.create();

        airTransportB.design();
        airTransportB.create();
    }
}
