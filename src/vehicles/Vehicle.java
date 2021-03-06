package vehicles;

import main.ParkingTicket;
import main.Ticket;

import java.util.Objects;

public abstract class Vehicle {
    private static int uniqueID = 1000;

    protected TypeOfVehicle type;
    private ParkingTicket parkingTicket;
    private int registrationPlate;
    private String brand;
    private String model;
    private int seatsCapacity;
    private String colour;
    private double fuelConsumptionPerKm;
    private double pricePerTicket;
    private int remainingSeats;

    public Vehicle (String brand,String model, int seatsCapacity, String colour,
                    double fuelConsumptionPerKm){
        this.brand = brand;
        this.model = model;
        this.seatsCapacity = seatsCapacity;
        this.colour = colour;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        this.registrationPlate = uniqueID++;
    }

    public Ticket buyATicket(int passengers, double distanceInKm){
        remainingSeats = seatsCapacity-passengers;
        this.pricePerTicket = distanceInKm*(fuelConsumptionPerKm/seatsCapacity*10)*passengers;
        Ticket newTicket = new Ticket(passengers, distanceInKm, this.pricePerTicket);
        System.out.println(newTicket.toString());
        System.out.println("Your transport vehicle: ");
        System.out.println(this.toString());
        return newTicket;
    }

    @Override
    public String toString() {
        return
                " brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seatsCapacity=" + seatsCapacity +
                ", colour='" + colour + '\'' +
                ", fuelConsumptionPerKm=" + fuelConsumptionPerKm +
                ", remainingSeats=" + remainingSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return registrationPlate == vehicle.registrationPlate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationPlate);
    }

    public TypeOfVehicle getType() {
        return type;
    }

    public int getRemainingSeats() {
        return remainingSeats;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public int getRegistrationPlate() {
        return registrationPlate;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeatsCapacity() {
        return seatsCapacity;
    }
}
