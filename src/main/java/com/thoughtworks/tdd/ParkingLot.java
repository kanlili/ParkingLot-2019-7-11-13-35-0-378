package com.thoughtworks.tdd;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<Ticket,Car> cars=new HashMap<>();
    public  void park(Ticket ticket, Car car) {
        cars.put(ticket, car);
    }

    public Car getCar(Ticket ticket) {
      // Car car=  cars.get(ticket);
       Car car =  cars.remove(ticket);
       return  car;
    }
}
