package com.arunkumars.portfolio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/portfolio"; // Update with your DB details
    private static final String USER = "root"; // MySQL username
    private static final String PASSWORD = "Arun@1107"; // MySQL password

    // Method to establish a connection to the database
    public static Connection getConnection() throws SQLException {
        try {
            // Load MySQL JDBC driver (optional in newer versions of Java)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish and return a connection to the database
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC driver not found", e);
        }
    }
}

