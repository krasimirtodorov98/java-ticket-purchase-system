package vehicles;

public class Train extends Vehicle{
    public Train(String brand, String model, int seatsCapacity, String colour, double fuelConsumptionPerKm) {
        super(brand, model, seatsCapacity, colour, fuelConsumptionPerKm);
        this.type = TypeOfVehicle.TRAIN;
    }
    @Override
    public String toString() {
        return "Train " + super.toString();
    }
}
