package FeedBack_Module.Pojo;

public class Feedback {

	int userId;
	int restaurantId;	
	String reply;
	int rating;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(int userId, int restaurantId, String reply, int rating) {
		super();
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.reply = reply;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [userId=" + userId + ", restaurantId=" + restaurantId + ", reply=" + reply + ", rating="
				+ rating + "]";
	}
	
	
	
}

