package com.arunkumars.portfolio.servlet;

import com.arunkumars.portfolio.dao.ProjectDAO;
import com.arunkumars.portfolio.model.Project;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.*;
import java.util.List;

public class ProjectServlet extends HttpServlet {

    private ProjectDAO projectDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        // Initialize ProjectDAO
        projectDAO = new ProjectDAO();
    }

    // Handle GET request to show all projects
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type
        response.setContentType("text/html");

        // Get all projects from the database using ProjectDAO
        List<Project> projects = projectDAO.getAllProjects();

        // Set the projects as a request attribute to be accessed in JSP
        request.setAttribute("projects", projects);

        // Forward the request to the JSP page to display the projects
        RequestDispatcher dispatcher = request.getRequestDispatcher("/project.jsp");
        dispatcher.forward(request, response);
    }

    // Handle POST request if needed (e.g., for adding or updating projects)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // You can handle form submissions here for adding or updating projects
        // Example: Add a new project to the database

        // Retrieve data from request (Form submission)
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String technologiesUsed = request.getParameter("technologiesUsed");
        String projectType = request.getParameter("projectType");
        String url = request.getParameter("url");

        // You can add a method to save this data to the database
        // projectDAO.addProject(new Project(name, description, technologiesUsed, projectType, url));

        // After adding the project, redirect or forward to show updated list
        response.sendRedirect("/project.jsp");
    }
}

