package com.yash.onlinefood.dao;

	
	import java.sql.SQLException;
	import java.util.List;

import com.yash.onlinefood.domain.Feedback;



	public interface FeedbackDao {
	    boolean addFeedback(Feedback feedback) throws SQLException;
//	    List<Feedback> getFeedbackByUser(String userName) throws SQLException;
//	    List<Feedback> getFeedbackByRestaurant(String restaurantName) throws SQLException;
	}

