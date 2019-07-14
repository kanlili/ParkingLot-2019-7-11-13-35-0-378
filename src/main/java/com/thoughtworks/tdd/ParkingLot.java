package com.thoughtworks.tdd;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<Ticket,Car> cars=new HashMap<>();
    private int maxCount=10;
//    public  void park(Ticket ticket, Car car) {
//        cars.put(ticket, car);
//    }

    public Car getCar(Ticket ticket) {
      // Car car=  cars.get(ticket);
       Car car =  cars.remove(ticket);
       return  car;
    }
    public Ticket park(Car car){
        if(cars.size()>=maxCount){
            return  null;
        }
        Ticket ticket=new Ticket();
        cars.put(ticket,car);
        return ticket;
    }
}
