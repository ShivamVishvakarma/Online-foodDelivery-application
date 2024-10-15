<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Restaurant</title>
</head>
<body>
    <h1>Add New Restaurant</h1>
    <form action="createRestaurant" method="post">
        Owner: <input type="text" name="owner" required><br>
        Name: <input type="text" name="name" required><br>
        Description: <textarea name="description" required></textarea><br>
        Cuisine Type: <input type="text" name="cuisineType" required><br>
        Address: <input type="text" name="address" required><br>
        Contact Information: <input type="number" name="contactInformation" required><br>
        Opening Hours: <input type="time" name="openingHours" required><br>
        Reviews: <textarea name="reviews"></textarea><br>
        Orders: <input type="number" name="orders" value="0"><br>
        Rating: <input type="number" name="numRating" step="0.1" min="0" max="5" value="0"><br>
        Registration Date: <input type="date" name="registrationDate" required><br>
        Open: <input type="checkbox" name="open" value="true"><br>
        Foods: <textarea name="foods"></textarea><br>
        <input type="submit" value="Add Restaurant">
    </form>
    <a href="listRestaurants">Back to List</a>
</body>
</html>