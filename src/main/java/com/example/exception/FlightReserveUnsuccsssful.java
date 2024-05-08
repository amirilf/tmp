package com.example.exception;

public class FlightReserveUnsuccsssful extends Exception{

    public FlightReserveUnsuccsssful(String message) {

        super("Flight reserve was unsuccessful??_"+message);
    }
}
