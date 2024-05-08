package com.example.exception.invalid.example.exception.invalid;

public class InvalidEmailAddress extends InvalidPassengerInformation {

    public InvalidEmailAddress(String message) {

        super(message);
    }

    public InvalidEmailAddress() {

        super("Invalid Email Address *_*");
    }
}
