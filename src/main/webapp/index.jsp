<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Food Delivery</title>
    <script src="https://kit.fontawesome.com/97ebdf5864.js" crossorigin="anonymous"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        
        .nav-bar {
            background-color: #337ab7;
            padding: 10px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        
        .nav-bar a {
            color: #ffffff;
            text-decoration: none;
            margin: 0 10px;
        }
        
        .nav-bar a:hover {
            color: #23527c;
        }
        
        .nav-buttons {
            display: flex;
            align-items: center;
        }
        
        .nav-buttons a {
            background-color: #337ab7;
            color: #ffffff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
        }
        
        .nav-buttons a:hover {
            background-color: #23527c;
        }
        
        .hamburger {
            display: inline-block;
            cursor: pointer;
        }
        
        .hamburger i {
            font-size: 24px;
            margin: 0 10px;
        }
    </style>
</head>
<body>
    <div class="nav-bar">
        <div class="nav-buttons">
            <a href="../OnlineFoodDelivery/jsp/login.jsp">Login <i class="fa fa-sign-in"></i></a>
            <a href="../OnlineFoodDelivery/jsp/registration.jsp">Register <i class="fa-solid fa-address-card"></i></a>
        </div>
        <div class="hamburger">
            <i class="fa-solid fa-bars"></i>
            
        </div>
    </div>
    <h1>Welcome!!! <i class="fa-solid fa-door-open"></i></h1>
</body>
</html>