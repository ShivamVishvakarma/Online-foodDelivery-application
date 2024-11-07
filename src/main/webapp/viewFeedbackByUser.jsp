<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Feedback by User</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Feedback by User</h2>
        <c:if test="${not empty feedbackList}">
            <c:forEach var="feedback" items="${feedbackList}">
                <div class="feedback-item">
                    <p><strong>User:</strong> ${feedback.userName}</p>
                    <p><strong>Restaurant:</strong> ${feedback.restaurantName}</p>
                    <p><strong>Reply:</strong> ${feedback.reply}</p>
                    <p><strong>Rating:</strong> ${feedback.rating}</p>
                </div>
            </c:forEach>
        </c:if>
        <c:if test="${empty feedbackList}">
            <p class="no-feedback">No feedback available for this user.</p>
        </c:if>
    </div>
</body>
</html>