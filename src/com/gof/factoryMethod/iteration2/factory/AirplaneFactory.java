package com.gof.factoryMethod.iteration2.factory;

import com.gof.factoryMethod.iteration2.airTransport.Airplane;
import com.gof.factoryMethod.iteration2.airTransport.IAirTransport;

public class AirplaneFactory implements IAirTransportFactory {
    @Override
    public IAirTransport create() {
        return new Airplane();
    }
}
