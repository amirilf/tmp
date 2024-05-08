package com.example.exception.invalid.example.exception;

public class TimeInterference extends FlightReserveUnsuccsssful {
    public TimeInterference(String message) {

        super(message);
    }

    public TimeInterference() {

        super("Time Interference error !_!");
    }
}
