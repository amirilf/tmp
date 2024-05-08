package com.example.exception.invalid;

public class InvalidInventory extends InvalidPassengerInformation{
    public InvalidInventory(String message) {

        super(message);
    }

    public InvalidInventory() {

        super("Invalid Inventory :_(");
    }
}
