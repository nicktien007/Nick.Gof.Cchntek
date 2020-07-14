package com.gof.abstractFactory;

import com.gof.abstractFactory.airTransport.IAirTransport;
import com.gof.abstractFactory.factory.AOEMFactory;
import com.gof.abstractFactory.factory.BOEMFactory;
import com.gof.abstractFactory.factory.IOEMFactory;
import com.gof.abstractFactory.vehicle.IVehicle;

import java.util.Optional;

public class MainForAbstractFactoryUseReflection {

    public static void main(String[] args) {

        IOEMFactory factory = getFactory(getFactoryClassName());
        IVehicle vehicle = factory.createVehicle();
        IAirTransport airTransport = factory.createAirTransport();

        vehicle.design();
        vehicle.create();

        airTransport.design();
        airTransport.create();
    }

    private static String getFactoryClassName() {
        //模擬設定檔取值
        return "com.gof.abstractFactory.factory.AOEMFactory";
    }

    private static IOEMFactory getFactory(String className) {

        IOEMFactory factory = null;
        try {
            factory =  (IOEMFactory)Class.forName(className).newInstance();
        }
        catch (Exception e)
        {
            //log..
        }

        return factory;
    }
}
