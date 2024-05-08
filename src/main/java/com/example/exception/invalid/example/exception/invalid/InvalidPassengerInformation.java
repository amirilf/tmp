package com.example.exception.invalid.example.exception.invalid;

public class InvalidPassengerInformation extends Exception{
    public InvalidPassengerInformation(String message) {

        super("Invalid Information!!_"+message);
    }
}
