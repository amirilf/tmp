package com.example.exception.invalid;

public class InvalidPhoneNumber extends InvalidPassengerInformation {
    public InvalidPhoneNumber(String message) {

        super(message);
    }

    public InvalidPhoneNumber() {

        super("Invalid Phone Number O_o");
    }
}
