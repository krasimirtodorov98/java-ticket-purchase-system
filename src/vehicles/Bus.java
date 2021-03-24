package vehicles;

public class Bus extends Vehicle{
    public Bus(String brand, String model, int seatsCapacity, String colour, double fuelConsumptionPerKm) {
        super(brand, model, seatsCapacity, colour, fuelConsumptionPerKm);
        this.type = TypeOfVehicle.BUS;
    }
    @Override
    public String toString() {
        return "Bus " + super.toString();
    }
}
