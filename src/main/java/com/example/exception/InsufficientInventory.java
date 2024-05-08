package com.example.exception;

public class InsufficientInventory extends FlightReserveUnsuccsssful{
    public InsufficientInventory(String message) {

        super(message);
    }

    public InsufficientInventory() {

        super("Insufficient Inventory #_#");
    }
}
