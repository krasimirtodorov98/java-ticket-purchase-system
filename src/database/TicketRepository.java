package database;

import main.Ticket;

import java.sql.*;

public class TicketRepository {
    public void addTicketToDB(Ticket ticket) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transport_industry", "admin", "12345")){
            try(PreparedStatement preparedStatement = connection.prepareStatement("insert into transport_industry.tickets (ticket_id, passengers, distance_in_km, price, purchased_on) values (?, ?, ?, ?, ?)")){

                preparedStatement.setInt(1, ticket.getTicketID());
                preparedStatement.setInt(2,ticket.getPassengers());
                preparedStatement.setDouble(3, ticket.getDistanceInKm());
                preparedStatement.setDouble(4, ticket.getPrice());
                preparedStatement.setTimestamp(5, Timestamp.valueOf(ticket.getTimeOfPurchase()));

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
