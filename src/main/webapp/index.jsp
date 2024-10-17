<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Submit Feedback</title>
</head>
<body>
    <h1>Enter Your Details</h1>
    <form action="feedback" method="post">
        <label for="userName">User Name:</label>
        <input type="text" id="userName" name="userName" required><br><br>

        <label for="restaurantName">Restaurant Name:</label>
        <input type="text" id="restaurantName" name="restaurantName" required><br><br>

        <input type="submit" value="Proceed to Feedback">
    </form>
</body>
</html>
