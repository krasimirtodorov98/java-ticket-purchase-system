package main;

import vehicles.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        AirportParking airportParking = new AirportParking("J.F.K.");

        Airplane airplane = new Airplane("Boeing", "777", 150, "White", 1);
        Car automobile = new Car("Volvo", "XC90", 5, "Silver", 0.1);
        Ship cruise = new Ship("Atlantic", "Titanic", 3000, "Red", 50);
        Train bdzh = new Train("Bdzh", "TR1587", 140, "Blue", 1);
        Bus bus = new Bus("Mercedes", "Jitney2000", 55, "Golden", 0.3);

        airportParking.addVehicle(airplane);
        airportParking.addVehicle(automobile);
        airportParking.addVehicle(cruise);
        airportParking.addVehicle(bdzh);
        airportParking.addVehicle(bus);
        airportParking.exitVehicleAndCalculatePrice(airplane);
        airportParking.exitVehicleAndCalculatePrice(automobile);
        airportParking.exitVehicleAndCalculatePrice(bdzh);


        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(airplane);
        vehicles.add(automobile);
        vehicles.add(cruise);
        vehicles.add(bdzh);
        vehicles.add(bus);

        ArrayList<Ticket> purchasedTickets = new ArrayList<>();

        int menuChoice = -1;
        int numberOfPeople;
        int distance;
        int menuControlValue = 0;
        String typeOfVehicle;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("---Ticket Purchase---");
            do {
                System.out.println("Choose vehicle type: \n Airplane \n Car \n Ship \n Train \n Bus");
                typeOfVehicle = sc.nextLine();
                for (TypeOfVehicle t : TypeOfVehicle.values()) {
                    if(t.toString().equalsIgnoreCase(typeOfVehicle)){
                        menuControlValue = 1;
                    }
                }
            }while(menuControlValue==0);

            do{
                System.out.println("Input number of passengers: ");
                numberOfPeople = sc.nextInt();
                if(numberOfPeople<1){
                    System.out.println("Invalid number of passengers! Try again: ");
                }
            }while(numberOfPeople<1);

            do{
                System.out.println("Input distance: ");
                distance = sc.nextInt();
                if(distance<1){
                    System.out.println("Invalid distance! Try again: ");
                }
            }while(distance<1);


            for (Vehicle v : vehicles) {
                if(v.getType().toString().equalsIgnoreCase(typeOfVehicle) && v.getRemainingSeats()>=numberOfPeople){
                    purchasedTickets.add(v.buyATicket(numberOfPeople, distance));
                }
            }

            System.out.println("\n To exit the menu press 0. \n To buy another ticket press any other number.");
            menuChoice = sc.nextInt();
        }while(menuChoice!=0);

        System.out.println("---All tickets you have purchased--- \n");
        for (Ticket t: purchasedTickets) {
            System.out.println(t.toString());
        }


    }
}
