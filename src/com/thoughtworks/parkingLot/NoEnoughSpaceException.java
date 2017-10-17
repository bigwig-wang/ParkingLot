package com.thoughtworks.parkingLot;

/**
 * Created by dhwang on 15/10/2017.
 */
public class NoEnoughSpaceException extends  Exception{
    public NoEnoughSpaceException(String message) {
        super(message);
    }
}
