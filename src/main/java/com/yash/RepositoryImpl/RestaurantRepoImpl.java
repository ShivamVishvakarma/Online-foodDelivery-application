package com.yash.RepositoryImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yash.Repository.RestaurantRepo;
import com.yash.Utils.DatabaseUtils;
import com.yash.pojo.Restaurant;

public class RestaurantRepoImpl implements RestaurantRepo{

	@Override
	public void addRestaurant(Restaurant restaurant) throws SQLException {
        String sql = "INSERT INTO restaurants (owner, name, description, cuisineType, address, contactInformation, openingHours, reviews, orders, numRating, registrationDate, open, foods) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseUtils.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            pstmt.setString(1, restaurant.getOwner());
            pstmt.setString(2, restaurant.getName());
            pstmt.setString(3, restaurant.getDescription());
            pstmt.setString(4, restaurant.getCuisineType());
            pstmt.setString(5, restaurant.getAddress());
            pstmt.setInt(6, restaurant.getContactInformation());
            pstmt.setTime(7, restaurant.getOpeningHours());
            pstmt.setString(8, restaurant.getReviews());
            pstmt.setInt(9, restaurant.getOrders());
            pstmt.setDouble(10, restaurant.getNumRating());
            pstmt.setDate(11, new java.sql.Date(restaurant.getRegistrationDate().getTime()));
            pstmt.setBoolean(12, restaurant.isOpen());
            pstmt.setString(13, restaurant.getFoods());
            
            int affectedRows = pstmt.executeUpdate();
            
            if (affectedRows == 0) {
                throw new SQLException("Creating restaurant failed, no rows affected.");
            }
            
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    restaurant.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Creating restaurant failed, no ID obtained.");
                }
            }
        }
    }

	@Override
	 public Restaurant getRestaurant(int id) throws SQLException
	{
        String sql = "SELECT * FROM restaurants WHERE id = ?";
        
        try (Connection conn = DatabaseUtils.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return extractRestaurantFromResultSet(rs);
                }
            }catch(Exception e) {
            	e.printStackTrace();
            }
        }
        return null;
    }

	private Restaurant extractRestaurantFromResultSet(ResultSet rs)throws SQLException {
		// TODO Auto-generated method stub
		return new Restaurant(
	            rs.getInt("id"),
	            rs.getString("owner"),
	            rs.getString("name"),
	            rs.getString("description"),
	            rs.getString("cuisineType"),
	            rs.getString("address"),
	            rs.getInt("contactInformation"),
	            rs.getTime("openingHours"),
	            rs.getString("reviews"),
	            rs.getInt("orders"),
	            rs.getDouble("numRating"),
	            rs.getDate("registrationDate"),
	            rs.getBoolean("open"),
	            rs.getString("foods")
	        );
	    }
		


	@Override
	public void updateRestaurant(Restaurant restaurant) throws SQLException {
		// TODO Auto-generated method stub
		
String sql = "UPDATE restaurants SET owner = ?, name = ?, description = ?, cuisineType = ?, address = ?, contactInformation = ?, openingHours = ?, reviews = ?, orders = ?, numRating = ?, registrationDate = ?, open = ?, foods = ? WHERE id = ?";
        
        try (Connection conn = DatabaseUtils.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, restaurant.getOwner());
            pstmt.setString(2, restaurant.getName());
            pstmt.setString(3, restaurant.getDescription());
            pstmt.setString(4, restaurant.getCuisineType());
            pstmt.setString(5, restaurant.getAddress());
            pstmt.setInt(6, restaurant.getContactInformation());
            pstmt.setTime(7, restaurant.getOpeningHours());
            pstmt.setString(8, restaurant.getReviews());
            pstmt.setInt(9, restaurant.getOrders());
            pstmt.setDouble(10, restaurant.getNumRating());
            pstmt.setDate(11, new java.sql.Date(restaurant.getRegistrationDate().getTime()));
            pstmt.setBoolean(12, restaurant.isOpen());
            pstmt.setString(13, restaurant.getFoods());
            pstmt.setInt(14, restaurant.getId());
            
            pstmt.executeUpdate();
        }
	}
	
	public List<Restaurant> getAllRestaurants() throws SQLException {
        List<Restaurant> restaurants = new ArrayList<>();
        String sql = "SELECT * FROM restaurants";
        
        try (Connection conn = DatabaseUtils.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                restaurants.add(extractRestaurantFromResultSet(rs));
            }
        }
        return restaurants;
    }
	

	@Override
	public void deleteRestaurant(int id) throws SQLException {
		// TODO Auto-generated method stub
String sql = "DELETE FROM restaurants WHERE id = ?";
        
        try (Connection conn = DatabaseUtils.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
		
	}
}

		
	



