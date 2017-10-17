package com.thoughtworks.calculator;

/**
 * Created by dhwang on 17/10/2017.
 */
public class NegativeNumberNotValidException extends Exception{

    public NegativeNumberNotValidException(String message) {
        super(message);
    }
}
