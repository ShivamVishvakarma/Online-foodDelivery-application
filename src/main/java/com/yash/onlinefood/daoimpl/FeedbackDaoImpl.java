package com.yash.onlinefood.daoimpl;

	

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

import com.yash.onlinefood.dao.FeedbackDao;
import com.yash.onlinefood.domain.Feedback;
import com.yash.onlinefood.util.JDBC_Utils;

	public class FeedbackDaoImpl implements FeedbackDao {

	    private static final String INSERT_FEEDBACK_SQL = "INSERT INTO feedback (user_id, restaurant_id, user_name,restaurant_name, reply, rating) VALUES (?, ?, ?, ?,?,?)";
//	    private static final String GET_FEEDBACK_BY_USER_SQL = "SELECT * FROM feedback WHERE user_name = ?";
//	    private static final String GET_FEEDBACK_BY_RESTAURANT_SQL = "SELECT * FROM feedback WHERE restaurant_name = ?";

	    @Override
	    public boolean addFeedback(Feedback feedback) throws SQLException {
	        try (Connection connection = JDBC_Utils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FEEDBACK_SQL)) {

	            preparedStatement.setInt(1, feedback.getUserId());
	            preparedStatement.setInt(2, feedback.getRestaurantId());
	            preparedStatement.setString(3,feedback.getUserName());
	            preparedStatement.setString(4,feedback.getRestaurantName());
	            preparedStatement.setString(5, feedback.getReply());
	            preparedStatement.setInt(6, feedback.getRating());

	            int result = preparedStatement.executeUpdate();
	            return result > 0;
	        }
	    }

	}

