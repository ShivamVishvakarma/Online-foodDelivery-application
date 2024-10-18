<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
    
    <script src="https://kit.fontawesome.com/97ebdf5864.js" crossorigin="anonymous"></script>
 
</head>
<body>

<div class="container">
    <h2>Login</h2>
    <form action="login" method="post" onsubmit="return handleLogin()">
        <div class="form-group">
            <input type="email" id="email" name="email" required>
            <label for="email">Email</label>
            <i class="fas fa-envelope"></i>
        </div>
        <div class="form-group">
            <input type="password" id="password" name="password" required>
            <label for="password">Password</label>
            <i class="fas fa-lock"></i>
        </div>
        
        <button type="submit">Login</button>
        <p>Don't have an account? <a href="registration.jsp">Register</a></p>

        
    </form>
</div>

</body>
</html>
  

