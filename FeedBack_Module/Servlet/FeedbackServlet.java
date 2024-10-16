package FeedBack_Module.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FeedBack_Module.Dao.FeedbackDao;
import FeedBack_Module.Dao.FeedbackDaoImpl;
import FeedBack_Module.Pojo.Feedback;

import java.io.IOException;
import java.sql.SQLException;

//@WebServlet("/submitFeedback1")
public class FeedbackServlet extends HttpServlet {
    private FeedbackDao feedbackDao = new FeedbackDaoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int userId = Integer.parseInt(request.getParameter("userId"));
        int restaurantId = Integer.parseInt(request.getParameter("restaurantId"));
        String reply = request.getParameter("reply");
        int rating = Integer.parseInt(request.getParameter("rating"));

        Feedback feedback = new Feedback(userId, restaurantId, reply, rating);

        try {
            feedbackDao.saveFeedback(feedback);
            response.sendRedirect("./feedbackSuccess.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("./error.jsp");
        }
    }
}
