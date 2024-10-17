package com.yash.onlinefood.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.onlinefood.pojo.Feedback;
import com.yash.onlinefood.repository.FeedbackRepository;
import com.yash.onlinefood.respositoryImpl.FeedbackRepositoryImpl;

@WebServlet("/feedback")
public class FeedbackController extends HttpServlet {
    private FeedbackRepository feedbackDao = new FeedbackRepositoryImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get parameters from the request
        String userName = request.getParameter("userName");
        String restaurantName = request.getParameter("restaurantName");

        // Check if we're submitting feedback or just moving to the feedback page
        String reply = request.getParameter("reply");
        String ratingStr = request.getParameter("rating");

        if (reply == null && ratingStr == null) {
            // This means we are at the first step, just forwarding to the feedback page
            request.setAttribute("userName", userName);
            request.setAttribute("restaurantName", restaurantName);
            request.getRequestDispatcher("feedback.jsp").forward(request, response);
        } else {
            // Second step: We are submitting the feedback
            int rating = Integer.parseInt(ratingStr);
            int userId = 1; // Fetch actual userId based on userName from database
            int restaurantId = 1; // Fetch actual restaurantId based on restaurantName from database

            Feedback feedback = new Feedback(userId, restaurantId, userName, restaurantName, reply, rating);

            try {
                boolean isAdded = feedbackDao.addFeedback(feedback);
                if (isAdded) {
                    response.sendRedirect("success.jsp"); // Redirect to success page
                } else {
                    response.getWriter().write("Failed to Submit Feedback");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                response.getWriter().write("Error in Database Operation");
            }
        }
    }
}

