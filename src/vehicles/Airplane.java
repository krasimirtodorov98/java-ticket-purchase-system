package vehicles;

public class Airplane extends Vehicle{

    public Airplane(String brand, String model, int seatsCapacity, String colour, double fuelConsumptionPerKm) {
        super(brand, model, seatsCapacity, colour, fuelConsumptionPerKm);
    }

    @Override
    public String toString() {
        return "Airplane " + super.toString();
    }
}
