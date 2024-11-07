package com.yash.onlinefood.servlet;
import com.yash.onlinefood.repository.FeedbackDao;
import com.yash.onlinefood.repositoryImpl.FeedbackDaoImpl;
import com.yash.onlinefood.domain.Feedback;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/viewFeedbackByUser")
public class FeedbackByUserServlet extends HttpServlet {
    private FeedbackDao feedbackDao = new FeedbackDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        System.out.println("User Name: " + userName);

        try {
            List<Feedback> feedbackList = feedbackDao.getFeedbackByUserName(userName);
            request.setAttribute("feedbackList", feedbackList);

            System.out.println("Feedback list size: " + (feedbackList != null ? feedbackList.size() : "null"));
            request.getRequestDispatcher("viewFeedbackByUser.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("Error retrieving feedback for user.");
        }
    }
}
