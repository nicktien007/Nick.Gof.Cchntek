package com.gof.singletonPattern;

public class Boss {
    private VehicleCenter vehicleCenter;

    public Boss() {
        this.vehicleCenter = VehicleCenter.getInstance();
    }

    public void create(int qCar, int qTruck ){
        vehicleCenter.createCar(qCar,qTruck);
    }

    public void showTotal(){
        System.out.println("生產" + vehicleCenter.getTotal() + "輛車");
    }
}
