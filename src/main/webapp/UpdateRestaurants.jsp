<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Restaurant</title>
</head>
<body>
    <h1>Edit Restaurant</h1>
    <form action="updateRestaurant" method="post">
        <input type="hidden" name="id" value="${restaurant.id}">
        Owner: <input type="text" name="owner" value="${restaurant.owner}" required><br>
        Name: <input type="text" name="name" value="${restaurant.name}" required><br>
        Description: <textarea name="description" required>${restaurant.description}</textarea><br>
        Cuisine Type: <input type="text" name="cuisineType" value="${restaurant.cuisineType}" required><br>
        Address: <input type="text" name="address" value="${restaurant.address}" required><br>
        Contact Information: <input type="number" name="contactInformation" value="${restaurant.contactInformation}" required><br>
        Opening Hours: <input type="text" name="openingHours" value="${restaurant.openingHours}" required><br>
        Reviews: <textarea name="reviews">${restaurant.reviews}</textarea><br>
        Orders: <input type="number" name="orders" value="${restaurant.orders}"><br>
        Rating: <input type="number" name="numRating" step="0.1" min="0" max="5" value="${restaurant.numRating}"><br>
        Registration Date: <input type="date" name="registrationDate" value="${restaurant.registrationDate}" required><br>
        Open: <input type="checkbox" name="open" value="true" ${restaurant.open ? 'checked' : ''}><br>
        Foods: <textarea name="foods">${restaurant.foods}</textarea><br>
        <input type="submit" value="Update Restaurant">
    </form>
    <a href="listRestaurants">Back to List</a>
</body>
</html>