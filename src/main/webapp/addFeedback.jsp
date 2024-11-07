<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Feedback</title>
</head>
<body>
    <h2>Submit Your Feedback</h2>
    <form action="addFeedback" method="post">
        <label>User Name:</label><input type="text" name="userName" required><br>
        <label>Restaurant Name:</label><input type="text" name="restaurantName" required><br>
        <label>Reply:</label><input type="text" name="reply" required><br>
        <label>Rating:</label><input type="number" name="rating" required><br>
        <button type="submit">Submit Feedback</button>
    </form>
</body>
</html>