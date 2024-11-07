package com.yash.onlinefood.repository;

import java.sql.SQLException;
import java.util.List;

import com.yash.onlinefood.domain.Feedback;

public interface FeedbackDao {
    boolean addFeedback(Feedback feedback) throws SQLException;
    List<Feedback> getFeedbackByUserName(String userName) throws SQLException;
    List<Feedback> getFeedbackByRestaurantName(String restaurantName) throws SQLException;
}