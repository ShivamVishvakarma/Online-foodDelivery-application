package com.yash.onlinefood.repository;

	
	import java.sql.SQLException;
	import java.util.List;

import com.yash.onlinefood.pojo.Feedback;

	public interface FeedbackRepository {
	    boolean addFeedback(Feedback feedback) throws SQLException;
//	    List<Feedback> getFeedbackByUser(String userName) throws SQLException;
//	    List<Feedback> getFeedbackByRestaurant(String restaurantName) throws SQLException;
	}

