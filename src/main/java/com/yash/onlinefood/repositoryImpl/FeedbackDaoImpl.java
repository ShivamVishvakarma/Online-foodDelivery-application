package com.yash.onlinefood.repositoryImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.onlinefood.domain.Feedback;
import com.yash.onlinefood.repository.FeedbackDao;
import com.yash.onlinefood.utils.JDBC_Utils;

public class FeedbackDaoImpl implements FeedbackDao {
    @Override
    public boolean addFeedback(Feedback feedback) throws SQLException {
        String sql = "INSERT INTO feedback (user_id,restaurant_id,user_name, restaurant_name, reply, rating) VALUES (?,?,?, ?, ?, ?)";
        try (Connection conn = JDBC_Utils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
        	ps.setInt(1, feedback.getUserId());
        	ps.setInt(2, feedback.getRestaurantId());
            ps.setString(3, feedback.getUserName());
            ps.setString(4, feedback.getRestaurantName());
            ps.setString(5, feedback.getReply());
            ps.setInt(6, feedback.getRating());
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public List<Feedback> getFeedbackByUserName(String userName) throws SQLException {
        String sql = "SELECT * FROM feedback WHERE user_name = ?";
        List<Feedback> feedbackList = new ArrayList<>();

        try (Connection conn = JDBC_Utils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	//Here for each row in result set,a new Feedback object is created,populated and added to feedbackList
                Feedback feedback = new Feedback();
                feedback.setUserId(rs.getInt("user_id"));
                feedback.setRestaurantId(rs.getInt("restaurant_id"));
                feedback.setUserName(rs.getString("user_name"));
                feedback.setRestaurantName(rs.getString("restaurant_name"));
                feedback.setReply(rs.getString("reply"));
                feedback.setRating(rs.getInt("rating"));

                feedbackList.add(feedback);
            }
        }
        return feedbackList;
    }



    @Override
    public List<Feedback> getFeedbackByRestaurantName(String restaurantName) throws SQLException {
        String sql = "SELECT * FROM feedback WHERE restaurant_name = ?";
        List<Feedback> feedbackList = new ArrayList<>();

        try (Connection conn = JDBC_Utils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, restaurantName);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Feedback feedback = new Feedback();
                feedback.setUserId(rs.getInt("user_id"));
                feedback.setRestaurantId(rs.getInt("restaurant_id"));
                feedback.setUserName(rs.getString("user_name"));
                feedback.setRestaurantName(rs.getString("restaurant_name"));
                feedback.setReply(rs.getString("reply"));
                feedback.setRating(rs.getInt("rating"));
                feedbackList.add(feedback);
            }
        }
        return feedbackList;
    }
}