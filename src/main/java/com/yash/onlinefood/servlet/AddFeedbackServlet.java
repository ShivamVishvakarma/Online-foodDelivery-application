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

	@WebServlet("/addFeedback")
	public class AddFeedbackServlet extends HttpServlet {
	    private FeedbackDao feedbackDao = new FeedbackDaoImpl();

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String userName = request.getParameter("userName");
	        String restaurantName = request.getParameter("restaurantName");
	        String reply = request.getParameter("reply");
	        int rating = Integer.parseInt(request.getParameter("rating"));

	        Feedback feedback = new Feedback(0, 0, userName, restaurantName, reply, rating);

	        try {
	            boolean isAdded = feedbackDao.addFeedback(feedback);
	            if (isAdded) {
	                response.sendRedirect("index.jsp?message=Feedback submitted successfully.");
	            } else {
	                response.getWriter().write("Failed to submit feedback.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            response.getWriter().write("Error occurred while submitting feedback.");
	        }
	    }
	}
