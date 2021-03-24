package vehicles;

public class Ship extends Vehicle{
    public Ship(String brand, String model, int seatsCapacity, String colour, double fuelConsumptionPerKm) {
        super(brand, model, seatsCapacity, colour, fuelConsumptionPerKm);
        this.type = TypeOfVehicle.SHIP;
    }
    @Override
    public String toString() {
        return "Ship " + super.toString();
    }
}
