package com.yash.onlinefood.repository;

import java.sql.SQLException;
import java.util.List;

import com.yash.onlinefood.pojo.Restaurant;

public interface RestaurantRepo {

	void addRestaurant(Restaurant restaurant) throws SQLException;

	Restaurant getRestaurant(int id) throws SQLException ;

	void updateRestaurant(Restaurant restaurant) throws SQLException;

	void deleteRestaurant(int id) throws SQLException;

	List<Restaurant> getAllRestaurants() throws SQLException;

}
