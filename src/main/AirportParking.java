package main;

import vehicles.*;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class AirportParking {
    HashMap<Integer, Airplane> airplaneParking= new HashMap<>();
    HashMap<Integer, Bus> busParking= new HashMap<>();
    HashMap<Integer, Car> carParking= new HashMap<>();
    HashMap<Integer, Ship> harbour = new HashMap<>();
    HashMap<Integer, Train> trainDepot= new HashMap<>();

    ArrayList<ParkingTicket> parkingTickets = new ArrayList<>();

    private String nameOfAirport;

    public ParkingTicket addVehicle (Vehicle v){
        ParkingTicket p = new ParkingTicket(v, LocalDateTime.now());
        //Add vehicle to parking lot by type of vehicle

        return p;
    }

    public double exitVehicleAndCalculatePrice (Vehicle v){
        double moneyToPay = 0;
       // moneyToPay = durationOfParking*moneyPerHourByTypeOfVehicle
        return moneyToPay;
    }
}
