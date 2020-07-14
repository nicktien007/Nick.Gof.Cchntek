package com.gof.abstractFactory.airTransport;

public class Helicopter implements IAirTransport{
    @Override
    public void design() {
        System.out.println("Design [Helicopter]");
    }

    @Override
    public void create() {
        System.out.println("Create [Helicopter]");
    }
}
