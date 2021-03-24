package main;

import vehicles.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class ParkingTicket {

    private static int uniqueID=1000;

    private int ID;
    private Vehicle vehicle;
    private LocalDateTime timeOfEntry;
    private LocalDateTime timeOfExit;
    private Duration durationOfParking; // = Duration.between(timeOfEntry,timeOfExit);

    public ParkingTicket(Vehicle vehicle, LocalDateTime timeOfEntry) {
        this.ID = uniqueID++;
        this.vehicle = vehicle;
        this.timeOfEntry = timeOfEntry;
    }
}
