<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Submit Feedback</title>
</head>
<body>
    <h1>Submit Feedback</h1>
    <form action="./submitFeedback" method="post">
        <label for="userId">User ID:</label>
        <input type="text" name="userId" required><br><br>

        <label for="restaurantId">Restaurant ID:</label>
        <input type="text" name="restaurantId" required><br><br>

        <label for="reply">Reply:</label>
        <textarea name="reply" required></textarea><br><br>

        <label for="rating">Rating:</label>
        <input type="number" name="rating" min="1" max="5" required><br><br>

        <input type="submit" value="Submit Feedback">
    </form>
</body>
</html>