package com.example.exception.invalid.example.exception;

public class OriginDestinationInterference extends FlightReserveUnsuccsssful {
    public OriginDestinationInterference(String message) {

        super(message);
    }

    public OriginDestinationInterference() {

        super("Origin & Destination Interference ://");
    }
}
