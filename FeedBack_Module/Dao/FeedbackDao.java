package FeedBack_Module.Dao;

import java.sql.SQLException;

import FeedBack_Module.Pojo.Feedback;



public interface FeedbackDao {
	void saveFeedback(Feedback feedback) throws SQLException;
}
