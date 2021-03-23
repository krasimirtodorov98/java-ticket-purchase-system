package main;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Ticket {
    private static int uniqueID = 1000;

    private int ticketID;
    private int passengers;
    private double distanceInKm;
    private double price;
    private LocalDateTime timeOfPurchase;

    public Ticket(int passengers, double distanceInKm, double price){
        this.passengers = passengers;
        this.distanceInKm = distanceInKm;
        this.price = price;
        this.ticketID = uniqueID++;
        this.timeOfPurchase = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "You have successfully purchased a ticket for:\n "
                + passengers + " passengers \n"
                + "Price: " + price + "\n"
                + "Unique ID: " + ticketID + "\n"
                + "Distance: " + distanceInKm +
                "\nTime of purchase: " + timeOfPurchase;
    }
}
