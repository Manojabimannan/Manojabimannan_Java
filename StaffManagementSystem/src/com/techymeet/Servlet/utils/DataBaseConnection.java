package com.techymeet.Servlet.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    // Method to establish and return a connection to the database
    public static Connection getConnection() {
        Connection con = null; // Initialize the Connection object to null

        try {
            // Load the MySQL JDBC driver explicitly
            Class.forName("com.mysql.jdbc.Driver");

            // Database connection details
            String url = "jdbc:mysql://localhost:3307/Staff"; // Database URL
            String user = "root"; // Database username
            String password = "admin"; // Database password

            // Establishing the connection
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully.");

        } catch (ClassNotFoundException e) {
            // Handle the case where the MySQL driver class is not found
            e.printStackTrace();
            System.out.println("MySQL JDBC Driver not found. Please include the JDBC driver in your project.");
            
        } catch (SQLException e) {
            // Handle SQL exceptions (bad connection, wrong URL, etc.)
            e.printStackTrace();
            System.out.println("Failed to establish connection.");

        } catch (Exception e) {
            // Handle any other exceptions
            e.printStackTrace();
        }

        return con; // Return the connection object (null if connection failed)
    }
}
