package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingBoyTest {
    @Test
     void should_return_car_when_fetch_car_given_car_ticket(){
         //given
         ParkingLot parkingLot=new ParkingLot();
         ParkingBoy parkingBoy=new ParkingBoy(parkingLot);
         Car car=new Car();
         Ticket ticket=parkingBoy.park(car);
         //when
         Car fetchedCar=parkingBoy.fectch(ticket);
         //then
         Assertions.assertSame(car, fetchedCar);
     }
     @Test
     void should_return_car_when_fetch_car_given_ticket(){
         //given
         ParkingLot parkingLot=new ParkingLot();
         ParkingBoy parkingBoy=new ParkingBoy(parkingLot);
         Car carone=new Car();
         Car cartwo=new Car();
         Ticket ticketone=parkingBoy.park(carone);
         Ticket tickettwo=parkingBoy.park(cartwo);
         //when
         Car fetchedCarone=parkingBoy.fectch(ticketone);
         Car fetchedCartwo=parkingBoy.fectch(tickettwo);
         //then
         Assertions.assertSame(carone, fetchedCarone);
         Assertions.assertSame(cartwo, fetchedCartwo);
     }
     @Test
    void should_return_null_when_fectch_car_given_wrong_ticket(){
         //given
         ParkingLot parkingLot=new ParkingLot();
         ParkingBoy parkingBoy=new ParkingBoy(parkingLot);
         Car car=new Car();
         parkingBoy.park(car);
         Ticket ticket=new Ticket();
         //when
         Car fetchedCar=parkingBoy.fectch(ticket);
         //then
         Assertions.assertSame(fetchedCar, null);

     }
    @Test
    void should_return_null_when_fectch_car_given_null_ticket(){
        //given
        ParkingLot parkingLot=new ParkingLot();
        ParkingBoy parkingBoy=new ParkingBoy(parkingLot);
        Car car=new Car();
        parkingBoy.park(car);
        Ticket ticket=new Ticket();
        //when
        Car fetchedCar=parkingBoy.fectch(null);
        //then
        Assertions.assertSame(fetchedCar, null);
    }
}
