package vehicles;

public class Car extends Vehicle{

    public Car(String brand, String model, int seatsCapacity, String colour, double fuelConsumptionPerKm) {
        super(brand, model, seatsCapacity, colour, fuelConsumptionPerKm);
    }
    @Override
    public String toString() {
        return "Car " + super.toString();
    }
}
