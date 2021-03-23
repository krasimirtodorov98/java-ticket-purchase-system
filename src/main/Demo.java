package main;

import vehicles.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", "777", 150, "White", 1);
        Car automobile = new Car("Volvo", "XC90", 5, "Silver", 0.1);
        Ship cruise = new Ship("Atlantic", "Titanic", 3000, "Red", 50);
        Train bdzh = new Train("Bdzh", "TR1587", 140, "Blue", 1);
        Bus bus = new Bus("Mercedes", "Jitney2000", 55, "Golden", 0.3);

        ArrayList<Ticket> purchasedTickets = new ArrayList<Ticket>();
        int menuChoice = -1;
        do {
            Scanner sc = new Scanner(System.in);
            int typeOfVehicle = 0;
            int numberOfPeople;
            int distance;
            System.out.println("---Ticket Purchase---");
            do {
                System.out.println("Choose vehicle type: \n 1-Airplane \n 2-Car \n 3-Cruise ship \n 4-Train \n 5-Bus");
                typeOfVehicle = sc.nextInt();
                if(typeOfVehicle<1||typeOfVehicle>5){
                    System.out.println("Invalid choice! Please try again: ");
                }
            }while(typeOfVehicle<1||typeOfVehicle>5);

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

            switch (typeOfVehicle){
                case 1:
                    purchasedTickets.add(airplane.buyATicket(numberOfPeople, distance));
                    break;
                case 2:
                    purchasedTickets.add(automobile.buyATicket(numberOfPeople, distance));
                    break;
                case 3:
                    purchasedTickets.add(cruise.buyATicket(numberOfPeople, distance));
                    break;
                case 4:
                    purchasedTickets.add(bdzh.buyATicket(numberOfPeople, distance));
                    break;
                case 5:
                    purchasedTickets.add(bus.buyATicket(numberOfPeople, distance));
                    break;
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
