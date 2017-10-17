package com.thoughtworks.parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dhwang on 15/10/2017.
 */
public class ParkingLotTest {

    @Test
    public void should_parking_a_car_when_parking_lot_have_enough_space() throws Exception {

        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car("C123");

        //when
        ParkingTicket ticket = parkingLot.park(car);

        //then
        assertEquals("C123",ticket.getPlateNumber());
    }

    //上面写了一个硬编码的测试，这时候我们可以写一个与上面同样的测试，来使上面错误，然后再删除当前测试
    
    //这个测试其实是可以干掉的
    @Test
    public void should_parking_another_car_when_parking_lot_have_enough_space() throws Exception {
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car("C456");

        //when
        ParkingTicket ticket = parkingLot.park(car);

        //then
        assertEquals("C456",ticket.getPlateNumber());
    }

    //存两台车
    @Test
    public void should_pick_one_more_car_when_parking_lot_have_enough_space() throws Exception {
        //given

    }

    @Test
    public void should_throw_exception_when_parking_lot_with_o_space(){
        //given
        ParkingLot parkingLot = new ParkingLot(0);
        Car car = new Car("C456");

        try{
            //when
            ParkingTicket ticket = parkingLot.park(car);
        }catch (NoEnoughSpaceException enoughSpaceException){
            //then
            System.out.println("xx");
        }

    }

    @Test
    public void should_pick_up_car_when_given_a_correct_ticket() throws Exception {
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car("C345");
        ParkingTicket ticket = parkingLot.park(car);

        //when
        Car pickedCar = parkingLot.pickUp(ticket);

        //then
        assertEquals("C345",pickedCar.getPlateNumber());
    }


    @Test
    public void should_pick_up_another_car_when_given_a_correct_ticket() throws Exception {
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car("C3456");
        ParkingTicket ticket = parkingLot.park(car);

        //when
        Car pickedCar = parkingLot.pickUp(ticket);

        //then
        assertEquals("C3456",pickedCar.getPlateNumber());
    }

    @Test
    public void should_not_pick_up_car_when_given_a_uncorrect_ticket() throws Exception {

    }

    //列tasking  采用given when then的方式
     /*
    停车
    1 given
        停车场10个空位  Car no = "C123"

            when
        parkingLOt.park(car);

      then
    停车成功，停车场里有这台车，或者是通过活得一个停车券，通过停车券上面的车牌号来判断停车成功*/

//     2  given
//        停车场 0个空位 Car no = ""C123;
//
//     parkingLot.park(car);
//
//     停车失败，抛出无空位异常

}
