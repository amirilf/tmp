package com.example.airport;

import com.example.exception.OriginDestinationInterference;
import com.example.exception.TimeInterference;
import com.example.exception.invalid.InvalidEmailAddress;
import com.example.exception.invalid.InvalidInventory;
import com.example.exception.invalid.InvalidPhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passenger {

    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private double balance ;
    private List<Flight> flights;

    public Passenger(String fullName, String phoneNumber, String emailAddress, double balance) throws InvalidPhoneNumber,InvalidEmailAddress,InvalidInventory {
        this.fullName = fullName;
        checkPhone(phoneNumber);
        checkEmail(emailAddress);
        checkInitialBalance(balance);
        this.flights = new ArrayList<>();
    }

    private void checkEmail(String email) throws InvalidEmailAddress {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()==false)
        {
            throw new InvalidEmailAddress();
        }
        else
            setEmailAddress(email);
    }

    private void checkPhone(String phone) throws InvalidPhoneNumber {
        Pattern pattern1 = Pattern.compile("^98\\d{10}$");
        Matcher matcher1 = pattern1.matcher(phone);
        if (matcher1.find()==false)
        {
            throw new InvalidPhoneNumber();
        }
        else
            setPhoneNumber(phone);
    }

    private void checkInitialBalance(double balance) throws InvalidInventory {
        if (balance<0)
        {
            throw new InvalidInventory();
        }
        else
            setBalance(balance);
    }

    public void reserveFlight(Flight flight) throws InvalidInventory, OriginDestinationInterference, TimeInterference {
        if (flight.getCost()>this.balance){
            throw new InvalidInventory();
        }
        if (!this.flights.get(this.flights.size()-1).getDestination().equals(flight.getOrigin())){
            throw new OriginDestinationInterference();
        }
        if(flight.getPassengers().size()+1>=flight.getCapacity()){
            throw new IndexOutOfBoundsException("flight capacity is full");
        }
        if (this.flights!=null && this.flights.size()>0){
            if(this.flights.get(this.flights.size()-1).getDate().isEqual(flight.getDate())){
                if (flight.getTime().isBefore(flights.get(flights.size()-1).getTime().plusMinutes(flights.get(flights.size()-1).getDuration()).plusHours(2)))
                {
                    throw new TimeInterference();
                }
            }
        }
        this.balance -=flight.getCost();
        this.flights.add(flight);
        flight.getPassengers().add(this);
    }

    public String showPassengerFlights(){
        StringBuilder flightsOfPassenger = new StringBuilder();

        for (Flight flight :flights) {

            flightsOfPassenger.append(flight.toString()+"_");
        }

        return flightsOfPassenger.toString();
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getAccountCredit() {
        return balance;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setBalance(double accountCredit) {
        this.balance = accountCredit;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", accountCredit=" + balance +
                '}';
    }
}
