package com.thoughtworks.tdd;

public class ParkingBoy {
    private ParkingLot parkingLot;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public String query() {
        return parkingLot.queryMsg();
    }

    public Ticket park(Car car) {
       // Ticket ticket=new Ticket();
       // parkingLot.park(car);
        return parkingLot.park(car);
    }

    public Car fectch(Ticket ticket) {
        return  parkingLot.getCar(ticket);
    }
}
