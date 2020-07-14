package com.gof.abstractFactory.airTransport;

public class Airplane implements IAirTransport {
    @Override
    public void design() {
        System.out.println("Design [Airplane]");
    }

    @Override
    public void create() {
        System.out.println("Create [Airplane]");
    }
}
