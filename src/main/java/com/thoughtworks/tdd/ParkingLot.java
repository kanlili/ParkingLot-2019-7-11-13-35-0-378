package com.thoughtworks.tdd;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<Ticket,Car> cars=new HashMap<>();
    private int maxCount=10;
    String msg="";
//    public  void park(Ticket ticket, Car car) {
//        cars.put(ticket, car);
//    }

    public Car getCar(Ticket ticket) {
      // Car car=  cars.get(ticket);
        if(ticket==null){
            msg="Please provide your parking ticket.";
            return  null;
        }
       Car car =  cars.remove(ticket);
       if(car==null) {
           msg = "Unrecognized parking ticket.";
       }

       return  car;
    }
    public Ticket park(Car car){
        if(cars.size()>=maxCount||cars.containsValue(car)||car==null){
            return  null;
        }
        Ticket ticket=new Ticket();
        cars.put(ticket,car);
        return ticket;
    }
    public String queryMsg(){
        return  msg;
    }
}
