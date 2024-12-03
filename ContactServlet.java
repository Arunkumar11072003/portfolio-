package com.myportfolio.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ContactServlet extends HttpServlet {

    // Handle GET requests (initial form loading)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward to the contact form page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/contact.jsp");
        dispatcher.forward(request, response);
    }

    // Handle POST requests (form submission)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form data from request
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // You can add logic here to process the data (save to DB, send email, etc.)
        // For now, we'll just log the received data (you can extend this later).
        System.out.println("Received contact form submission:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);

        // Redirect to a thank you page after form submission
        response.sendRedirect("thankyou.jsp");
    }
}
