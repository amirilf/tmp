package com.example.airport;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
    private LocalDate date;
    private LocalTime time;
    private List<Passenger> passengers;
    private String origin;
    private String destination;
    private double distance;
    private int duration;
    private int speed;
    private double cost;
    private int capacity;

    public Flight(LocalDate date, LocalTime time , String origin, String destination, double distance, int duration, double cost, int capacity)throws ArithmeticException {
        this.date = date;
        this.time = time;
        this.passengers = new ArrayList<>();
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.duration = duration;
        this.speed = (((int)(distance)) / duration) * ( 100 / 6 ) ;
        this.cost = cost;
        this.capacity = capacity;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    public int getSpeed() {
        return speed;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "date=" + date +
                ", time=" + time +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", distance=" + distance +
                ", duration=" + duration +
                ", speed=" + speed +
                ", cost=" + cost +
                ", capacity=" + capacity +
                '}';
    }
}
