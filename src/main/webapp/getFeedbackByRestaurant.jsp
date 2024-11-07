<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Get Feedback by Restaurant</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Enter Restaurant Name to View Feedback</h2>
        <form action="viewFeedbackByRestaurant" method="get">
            <label for="restaurantName">Restaurant Name:</label>
            <input type="text" name="restaurantName" id="restaurantName" required>
            <button type="submit">View Feedback</button>
        </form>
    </div>
</body>
</html>
