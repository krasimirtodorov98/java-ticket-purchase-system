package database;
import vehicles.*;
import java.sql.*;

public class VehicleRepository {
    public void addVehicleToDB(Vehicle vehicle) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transport_industry", "admin", "12345")){
            try(PreparedStatement preparedStatement = connection.prepareStatement("insert into transport_industry.vehicles (type_of_vehicle, registration_plate, brand, model, seats_capacity) values (?, ?, ?, ?, ?)")){

                preparedStatement.setString(1, vehicle.getType().toString());
                preparedStatement.setInt(2, vehicle.getRegistrationPlate());
                preparedStatement.setString(3, vehicle.getBrand());
                preparedStatement.setString(4, vehicle.getModel());
                preparedStatement.setInt(5, vehicle.getSeatsCapacity());

                int row = preparedStatement.executeUpdate();

                System.out.println(row);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
