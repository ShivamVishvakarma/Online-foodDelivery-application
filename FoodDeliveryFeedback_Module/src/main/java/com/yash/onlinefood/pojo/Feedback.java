package com.yash.onlinefood.pojo;

public class Feedback {
	    private int userId;
	    private int restaurantId;
	    private String userName;
	    private String restaurantName;
	    private String reply;
	    private int rating;

	    
	    public Feedback() {}

	    public Feedback(int userId, int restaurantId, String userName, String restaurantName, String reply, int rating) {
	        this.userId = userId;
	        this.restaurantId = restaurantId;
	        this.userName = userName;
	        this.restaurantName = restaurantName;
	        this.reply = reply;
	        this.rating = rating;
	    }

	    public int getUserId() { return userId; }
	    public void setUserId(int userId) { this.userId = userId; }

	    public int getRestaurantId() { return restaurantId; }
	    public void setRestaurantId(int restaurantId) { this.restaurantId = restaurantId; }

	    public String getUserName() { return userName; }
	    public void setUserName(String userName) { this.userName = userName; }

	    public String getRestaurantName() { return restaurantName; }
	    public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }

	    public String getReply() { return reply; }
	    public void setReply(String reply) { this.reply = reply; }

	    public int getRating() { return rating; }
	    public void setRating(int rating) { this.rating = rating; }
	

}
