package com.driver;

public class Boat implements WaterVehicle{
    int capacityOfBoat;
    String nameOfBoat;

    public  Boat(int capacityOfBoat , String nameOfBoat){
        this.capacityOfBoat = capacityOfBoat;
        this.nameOfBoat = nameOfBoat;
    }

    public void setCapacityOfBoat(int capacityOfBoat) {
        this.capacityOfBoat = capacityOfBoat;
    }

    public void setNameOfBoat(String nameOfBoat) {
        this.nameOfBoat = nameOfBoat;
    }

    @Override
    public String getVehicleName() {
        return this.nameOfBoat;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacityOfBoat;
    }
}
