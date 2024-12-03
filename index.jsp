<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to My Portfolio</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to your custom CSS (optional) -->
</head>
<body>
    <header>
        <div class="navbar">
            <a href="index.jsp" class="navbar-link">Home</a>
            <a href="projects.jsp" class="navbar-link">Projects</a>
            <a href="contact.jsp" class="navbar-link">Contact</a>
        </div>
    </header>

    <section class="hero">
        <h1>Welcome to My Portfolio</h1>
        <p>I am Arunkumar S, a Full Stack Developer passionate about creating web applications and software solutions.</p>
        <a href="projects.jsp" class="cta-button">View My Projects</a>
    </section>

    <section class="about">
        <h2>About Me</h2>
        <p>
            I specialize in Java, full-stack development, and creating dynamic, user-friendly applications. 
            I have a strong background in both front-end and back-end technologies and am always eager to learn and grow in the tech field.
        </p>
        <a href="contact.jsp" class="cta-button">Get in Touch</a>
    </section>

    <footer>
        <p>&copy; 2024 Arunkumar S. All rights reserved.</p>
    </footer>

    <!-- Optional JavaScript -->
    <script src="script.js"></script> <!-- Link to your JavaScript file (optional) -->
</body>
</html>
