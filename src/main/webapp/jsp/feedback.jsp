<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Feedback Page</title>
    <style>
        /* Add some basic styling for the form */
        form {
            margin: 20px;
            padding: 10px;
            border: 1px solid #ccc;
            width: 300px;
        }
        input, textarea {
            width: 100%;
            margin-bottom: 10px;
            padding: 8px;
        }
    </style>
</head>
<body>
    <h1>Welcome, <%= request.getAttribute("userName") %>!</h1>
    <p>You are providing feedback for <%= request.getAttribute("restaurantName") %>.</p>

    <form action="feedback" method="post">
        <label for="reply">Feedback Reply:</label>
        <textarea id="reply" name="reply" required></textarea><br><br>

        <label for="rating">Rating (1 to 5):</label>
        <input type="number" id="rating" name="rating" min="1" max="5" required><br><br>

        <!-- Pass the user and restaurant names along to the next form submission -->
        <input type="hidden" name="userName" value="<%= request.getAttribute("userName") %>">
        <input type="hidden" name="restaurantName" value="<%= request.getAttribute("restaurantName") %>">

        <input type="submit" value="Submit Feedback">
    </form>
</body>
</html>
