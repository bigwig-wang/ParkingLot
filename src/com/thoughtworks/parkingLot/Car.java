package com.thoughtworks.parkingLot;

/**
 * Created by dhwang on 15/10/2017.
 */
public class Car {
    private String plateNumber;

    public Car(String plateNumber) {

        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
