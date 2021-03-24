package main;

import vehicles.*;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class AirportParking {
    public HashMap<Integer , Airplane> airplaneParking;
    private HashMap<Integer, Bus> busParking;
    private HashMap<Integer, Car> carParking;
    private HashMap<Integer, Ship> harbour;
    private HashMap<Integer, Train> trainDepot;

    private HashMap<Integer, ParkingTicket> parkingTickets;

    private String nameOfAirport;

    public AirportParking(String nameOfAirport) {
        this.nameOfAirport = nameOfAirport;
        this.airplaneParking = new HashMap<>();
        this.busParking = new HashMap<>();
        this.carParking = new HashMap<>();
        this.harbour = new HashMap<>();
        this.trainDepot = new HashMap<>();
        this.parkingTickets = new HashMap<>();
    }

    public ParkingTicket addVehicle (Vehicle v){
        ParkingTicket p = new ParkingTicket(v, LocalDateTime.now());
        this.parkingTickets.put(p.getID(), p);
        v.setParkingTicket(p);
        p.setVehicle(v);
        switch(v.getType()){
            case AIRPLANE -> airplaneParking.put(v.getRegistrationPlate(), (Airplane) v);
            case BUS -> busParking.put(v.getRegistrationPlate(), (Bus) v);
            case CAR -> carParking.put(v.getRegistrationPlate(), (Car) v);
            case SHIP -> harbour.put(v.getRegistrationPlate(), (Ship) v);
            case TRAIN -> trainDepot.put(v.getRegistrationPlate(), (Train) v);
        }
        return p;
    }

    public double exitVehicleAndCalculatePrice (Vehicle v){
        double moneyToPay = 3; //minimum amount to pay
        long durationOfParking = Duration.between(v.getParkingTicket().getTimeOfEntry(),LocalDateTime.now()).toHours();
        if(durationOfParking<1){
            System.out.println("You owe 3.0 BGN for parking for vehicle with registration plate: " + v.getRegistrationPlate());
        }
        else {
            moneyToPay = durationOfParking * 3; //*3 represents 3 BGN/hour
            System.out.println("You owe " + moneyToPay + " BGN for parking for vehicle with registration plate: " + v.getRegistrationPlate());
        }
        return moneyToPay;
    }
}
