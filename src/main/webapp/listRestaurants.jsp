<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Restaurant List</title>
</head>
<body>
    <h1>Restaurant List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Cuisine Type</th>
            <th>Address</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="restaurant" items="${restaurants}">
            <tr>
                <td>${restaurant.id}</td>
                <td>${restaurant.name}</td>
                <td>${restaurant.cuisineType}</td>
                <td>${restaurant.address}</td>
                <td>
                    <a href="readRestaurant?id=${restaurant.id}">View</a>
                    <a href="editRestaurant?id=${restaurant.id}">Edit</a>
                    <form action="deleteRestaurant" method="post" style="display:inline;">
                        <input type="hidden" name="id" value="${restaurant.id}">
                        <input type="submit" value="Delete">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="createRestaurants.jsp">Add New Restaurant</a>
</body>
</html>