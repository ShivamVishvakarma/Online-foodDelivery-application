<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Get Feedback by User</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Enter User Name to View Feedback</h2>
        <form action="viewFeedbackByUser" method="get">
            <label for="userName">User Name:</label>
            <input type="text" name="userName" id="userName" required>
            <button type="submit">View Feedback</button>
        </form>
    </div>
</body>
</html>