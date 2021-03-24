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

    public ParkingTicket(Vehicle vehicle, LocalDateTime timeOfEntry) {
        this.ID = uniqueID++;
        this.vehicle = vehicle;
        this.timeOfEntry = timeOfEntry;
    }

    public LocalDateTime getTimeOfEntry() {
        return timeOfEntry;
    }

    public void setTimeOfEntry(LocalDateTime timeOfEntry) {
        this.timeOfEntry = timeOfEntry;
    }

    public int getID() {
        return ID;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
