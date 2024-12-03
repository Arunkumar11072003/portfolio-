<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error Occurred</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            padding: 50px;
        }
        h1 {
            color: red;
        }
        p {
            color: #333;
        }
        .error-details {
            margin-top: 20px;
            background-color: #f9f9f9;
            padding: 10px;
            border: 1px solid #ccc;
        }
    </style>
</head>
<body>
    <h1>Error: Something Went Wrong!</h1>
    <p>We're sorry, but something went wrong while processing your request. Please try again later.</p>
    
    <!-- Display detailed error info if available -->
    <c:if test="${not empty exception}">
        <div class="error-details">
            <h3>Error Details:</h3>
            <p><strong>Exception:</strong> ${exception}</p>
        </div>
    </c:if>

    <p><a href="index.jsp">Return to Home Page</a></p>
</body>
</html>
