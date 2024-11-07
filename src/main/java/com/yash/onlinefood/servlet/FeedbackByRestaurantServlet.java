package com.yash.onlinefood.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.onlinefood.domain.Feedback;
import com.yash.onlinefood.repository.FeedbackDao;
import com.yash.onlinefood.repositoryImpl.FeedbackDaoImpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/viewFeedbackByRestaurant")
public class FeedbackByRestaurantServlet extends HttpServlet {
    private FeedbackDao feedbackDao = new FeedbackDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String restaurantName = request.getParameter("restaurantName");
        System.out.println("Restaurant Name: " + restaurantName);

        try {
            List<Feedback> feedbackList = feedbackDao.getFeedbackByRestaurantName(restaurantName);
            request.setAttribute("feedbackList", feedbackList);
            request.getRequestDispatcher("viewFeedbackByRestaurant.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("Error retrieving feedback for restaurant.");
        }
    }
}