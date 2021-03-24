package vehicles;

public enum TypeOfVehicle {
    CAR(0),
    AIRPLANE(1),
    BUS(2),
    SHIP(3),
    TRAIN(4);

    public int value;

    TypeOfVehicle(int value) {
        this.value = value;
    }
}
