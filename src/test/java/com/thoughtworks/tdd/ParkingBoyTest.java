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
    @Test
    void should_return_null_when_fetch_car_given_used_ticket(){
        //given
        ParkingLot parkingLot=new ParkingLot();
        ParkingBoy parkingBoy=new ParkingBoy(parkingLot);
        Car car=new Car();
        Ticket ticket=parkingBoy.park(car);
        //when
        parkingBoy.fectch(ticket);
        Car fetchedCarTwo=parkingBoy.fectch(ticket);
        //then
        Assertions.assertSame(fetchedCarTwo, null);
    }
    @Test
    void should_return_not_parking_car_when_parkignlot_capacity_full_gien_over10(){
        //given
        ParkingLot parkingLot=new ParkingLot();
        ParkingBoy parkingBoy=new ParkingBoy(parkingLot);
        //Car car=new Car();
        for(int i=0;i<10;i++){
            Car carTen=new Car();
            parkingBoy.park(carTen);
        }
        Car overcar=new Car();
        Ticket ticket=parkingBoy.park(overcar);
        //when
        //Car fetchedCar=parkingBoy.fectch(ticket);
        //then
        Assertions.assertSame(ticket, null);
    }
    @Test
    void should_return_no_car_when_park_car_given_parked_car(){
        //given
        ParkingLot parkingLot=new ParkingLot();
        ParkingBoy parkingBoy=new ParkingBoy(parkingLot);
        Car car=new Car();
        Ticket ticketone=parkingBoy.park(car);
        Ticket tickettwo=parkingBoy.park(car);
        //when
        //Car fetchedCar=parkingBoy.fectch(ticket);
        //then
        Assertions.assertSame(tickettwo,null );

    }
    @Test
    void should_return_null_when_park_car_given_null_car(){
        //given
        ParkingLot parkingLot=new ParkingLot();
        ParkingBoy parkingBoy=new ParkingBoy(parkingLot);
       // Car car=new Car();
        Ticket ticketone=parkingBoy.park(null);
        Assertions.assertSame(ticketone,null );
    }
}
