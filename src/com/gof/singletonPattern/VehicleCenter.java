package com.gof.singletonPattern;

public class VehicleCenter {

    private final static VehicleCenter vc = new VehicleCenter();

    private CarFactory carFactory;
    private TruckFactory truckFactory;

    private VehicleCenter() {
        this.carFactory = new CarFactory();
        this.truckFactory = new TruckFactory();
    }

    public int getTotal() {
        return total;
    }

    private int total;

    public void createCar(int qCar, int qTruck){
        carFactory.create(qCar);
        truckFactory.create(qTruck);

        total += qCar + qTruck;
    }

    public static VehicleCenter getInstance(){
        return vc;
    }
}
