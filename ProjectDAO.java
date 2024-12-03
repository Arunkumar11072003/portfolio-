package com.arunkumars.portfolio.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.arunkumars.portfolio.model.Project;

public class ProjectDAO {

    // Method to fetch all projects from the database
    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();
        
        // SQL query to fetch all projects
        String query = "SELECT * FROM Projects";
        
        try (Connection connection = DatabaseConnection.getConnection(); 
             Statement stmt = connection.createStatement()) {
            
            ResultSet rs = stmt.executeQuery(query);
            
            // Iterate through the result set and create Project objects
            while (rs.next()) {
                Project project = new Project(
                    rs.getInt("id"),                   // Project ID
                    rs.getString("name"),              // Project Name
                    rs.getString("description"),       // Project Description
                    rs.getString("technologies_used"), // Technologies Used
                    rs.getString("project_type"),      // Project Type
                    rs.getString("url")                // Project URL
                );
                projects.add(project);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Print SQL error if occurs
        }
        
        return projects; // Return the list of projects
    }

    // Method to fetch a single project by ID
    public Project getProjectById(int projectId) {
        Project project = null;
        String query = "SELECT * FROM Projects WHERE id = ?";
        
        try (Connection connection = DatabaseConnection.getConnection(); 
             PreparedStatement pstmt = connection.prepareStatement(query)) {
            
            pstmt.setInt(1, projectId); // Set the project ID in the query
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                project = new Project(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("description"),
                    rs.getString("technologies_used"),
                    rs.getString("project_type"),
                    rs.getString("url")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Print SQL error if occurs
        }
        
        return project; // Return the project object
    }
}

