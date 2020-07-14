package com.gof.factoryMethod.iteration2;

import com.gof.factoryMethod.iteration2.airTransport.IAirTransport;
import com.gof.factoryMethod.iteration2.factory.AirplaneFactory;
import com.gof.factoryMethod.iteration2.factory.CarFactory;
import com.gof.factoryMethod.iteration2.factory.IAirTransportFactory;
import com.gof.factoryMethod.iteration2.factory.IVehicleFactory;
import com.gof.factoryMethod.iteration2.vehicle.IVehicle;

public class MainForFactoryMethod2 {

    public static void main(String[] args) {

        IVehicleFactory factory = new CarFactory();
        IVehicle vehicle = factory.create();
        vehicle.design();
        vehicle.create();

        IAirTransportFactory airplaneFactory = new AirplaneFactory();
        IAirTransport iVehicle = airplaneFactory.create();
        iVehicle.design();
        iVehicle.create();

    }
}
