package FeedBack_Module.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import FeedBack_Module.JDBC_Utils.JDBC_Utils;


public class FeedbackDaoImpl implements FeedbackDao {

    private static final String INSERT_FEEDBACK_SQL = "INSERT INTO feedback (user_id, restaurant_id, reply, rating) VALUES (?, ?, ?, ?)";

    @Override
    public void saveFeedback(FeedBack_Module.Pojo.Feedback feedback) throws SQLException {
        try (Connection connection = JDBC_Utils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FEEDBACK_SQL)) {

            preparedStatement.setInt(1, feedback.getUserId());
            preparedStatement.setInt(2, feedback.getRestaurantId());
            preparedStatement.setString(3, feedback.getReply());
            preparedStatement.setInt(4, feedback.getRating());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error saving feedback: " + e.getMessage());
        }
    }

	
}
