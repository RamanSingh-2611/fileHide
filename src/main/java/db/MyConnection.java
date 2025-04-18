package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbjava?useSSL=false", "root", "101010");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connected to database..");
        return connection;
    }
    public static void closeConnection() {
        if (connection != null) {
            try{
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

}
