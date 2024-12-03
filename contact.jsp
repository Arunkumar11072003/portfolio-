<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Me</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to your custom CSS (optional) -->
</head>
<body>
    <div class="container">
        <header>
            <h1>Contact Me</h1>
            <p>If you have any questions or feedback, feel free to reach out to me!</p>
        </header>

        <form action="ContactServlet" method="post">
            <div class="form-group">
                <label for="name">Your Name:</label>
                <input type="text" id="name" name="name" required placeholder="Enter your name">
            </div>
            
            <div class="form-group">
                <label for="email">Your Email:</label>
                <input type="email" id="email" name="email" required placeholder="Enter your email">
            </div>

            <div class="form-group">
                <label for="message">Your Message:</label>
                <textarea id="message" name="message" rows="5" required placeholder="Enter your message"></textarea>
            </div>

            <div class="form-group">
                <button type="submit">Send Message</button>
            </div>
        </form>

        <footer>
            <p>&copy; 2024 Your Portfolio. All rights reserved.</p>
        </footer>
    </div>

    <!-- Optional JavaScript -->
    <script src="script.js"></script> <!-- Link to your JavaScript file (optional) -->
</body>
</html>
