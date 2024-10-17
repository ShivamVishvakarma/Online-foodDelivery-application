<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Restaurant Details</title>
</head>
<body>
    <h1>Restaurant Details</h1>
    <p>ID: ${restaurant.id}</p>
    <p>Owner: ${restaurant.owner}</p>
    <p>Name: ${restaurant.name}</p>
    <p>Description: ${restaurant.description}</p>
    <p>Cuisine Type: ${restaurant.cuisineType}</p>
    <p>Address: ${restaurant.address}</p>
    <p>Contact Information: ${restaurant.contactInformation}</p>
    <p>Opening Hours: ${restaurant.openingHours}</p>
    <p>Reviews: ${restaurant.reviews}</p>
    <p>Orders: ${restaurant.orders}</p>
    <p>Rating: ${restaurant.numRating}</p>
    <p>Registration Date: ${restaurant.registrationDate}</p>
    <p>Open: ${restaurant.open ? 'Yes' : 'No'}</p>
    <p>Foods: ${restaurant.foods}</p>
    
    <a href="UpdateRestaurants?id=${restaurant.id}">Edit</a>
    <form action="deleteRestaurants" method="post" style="display:inline;">
        <input type="hidden" name="id" value="${restaurant.id}">
        <input type="submit" value="Delete">
    </form>
    <a href="listRestaurants">Back to List</a>
</body>
</html>