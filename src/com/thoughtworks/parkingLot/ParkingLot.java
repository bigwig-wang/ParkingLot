package com.thoughtworks.parkingLot;

/**
 * Created by dhwang on 15/10/2017.
 */
public class ParkingLot {
    private int totalSpace;

    public ParkingLot(int totalSpace) {
        this.totalSpace = totalSpace;
    }

    public ParkingTicket park(Car car) throws NoEnoughSpaceException {

        if(this.totalSpace > 0){

            return new ParkingTicket(car.getPlateNumber());
        }
        throw new NoEnoughSpaceException("No enough space for this parking lot!");
    }

    public Car pickUp(ParkingTicket ticket) {
        return new Car(ticket.getPlateNumber());
    }
}
