 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title> Registration Form</title>
<script>
    function validateForm() {
        var password = document.getElementById("password").value;
        var confirm_password = document.getElementById("confirm_password").value;

        if (password !== confirm_password) {
            alert("Passwords do not match");
            return false; 
        }
        return true; 
    }
</script>
</head>
<body>
<div class="container">
    <h2>Registration Form</h2>
    <form action="user" method="post" >
        <!-- Form fields -->
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="email">Email ID:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="confirm_password">Confirm Password:</label>
            <input type="password" id="confirm_password" name="confirm_password" required>
        </div>
        <div class="form-group">
            <input type="submit" value="Submit">
        </div>
    </form>
</div>
</body>
</html>
 