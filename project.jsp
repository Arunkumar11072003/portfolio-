<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.ee/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Project List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 80%;
            margin: 0 auto;
        }
        h1 {
            text-align: center;
            margin-top: 20px;
            color: #333;
        }
        .project-card {
            background-color: white;
            border: 1px solid #ddd;
            border-radius: 8px;
            margin: 10px 0;
            padding: 15px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .project-card h3 {
            margin-top: 0;
            color: #007BFF;
        }
        .project-card p {
            font-size: 14px;
            color: #555;
        }
        .project-card .date {
            font-size: 12px;
            color: #777;
        }
        .button {
            background-color: #007BFF;
            color: white;
            padding: 8px 16px;
            text-decoration: none;
            border-radius: 4px;
            font-size: 14px;
            margin-top: 10px;
            display: inline-block;
        }
        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>Project List</h1>
        
        <!-- Displaying the list of projects dynamically -->
        <c:if test="${empty projects}">
            <p>No projects available.</p>
        </c:if>

        <c:forEach var="project" items="${projects}">
            <div class="project-card">
                <h3>${project.name}</h3>
                <p>${project.description}</p>
                <div class="date">
                    <strong>Start Date:</strong> ${project.startDate} <br>
                    <strong>End Date:</strong> ${project.endDate}
                </div>
                <a href="projectDetails.jsp?projectId=${project.id}" class="button">View Details</a>
            </div>
        </c:forEach>
    </div>

</body>
</html>
