package com.gof.simpleFactory.vehicle;

public class MotorCycle  implements IVehicle{
    @Override
    public void design() {
        System.out.println("Design [MotorCycle]");
    }

    @Override
    public void create() {
        System.out.println("Create [MotorCycle]");
    }
}
