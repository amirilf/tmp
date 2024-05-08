package com.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.example.airport.Flight;
import com.example.airport.Passenger;
import com.example.exception.OriginDestinationInterference;
import com.example.exception.TimeInterference;
import com.example.exception.invalid.InvalidEmailAddress;
import com.example.exception.invalid.InvalidInventory;
import com.example.exception.invalid.InvalidPhoneNumber;

public class Main {
    public static void main(String[] args) throws InvalidPhoneNumber, InvalidEmailAddress, InvalidInventory,
            OriginDestinationInterference, TimeInterference {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("13/02/2022", formatter);

        Flight f1 = new Flight(date, LocalTime.parse("23:00"), "isfahan", "tehran",
                320.5, 55, 780.3, 2);
        Flight f2 = new Flight(date, LocalTime.parse("21:00"), "isfahan", "mashhad",
                900d, 110, 1570.5, 50);
        Flight f3 = new Flight(date, LocalTime.parse("23:00"), "isfahan", "tehran",
                320.5, 55, 780.3, 87);

        String name1 = sc.next();
        String name2 = sc.next();

        String phone1 = sc.next();
        String phone2 = sc.next();

        String email1 = sc.next();
        String email2 = sc.next();

        double balance1 = sc.nextDouble();
        double balance2 = sc.nextDouble();

        Passenger p1 = new Passenger(name1, phone1, email1, balance1);
        Passenger p2 = new Passenger(name2, phone2, email2, balance2);
        Passenger p3 = new Passenger("ali", "9301112233", "abc@gmail.com", 2000.5);
        Passenger p4 = new Passenger("zahra", "989301112233", "abcgl.com", 3000d);

        p1.reserveFlight(f1);
        p1.reserveFlight(f2);

        p2.reserveFlight(f3);
        p2.reserveFlight(f2);

        p3.reserveFlight(f1);
        p3.reserveFlight(f3);

        p4.reserveFlight(f1);
        p4.reserveFlight(f2);

    }
}