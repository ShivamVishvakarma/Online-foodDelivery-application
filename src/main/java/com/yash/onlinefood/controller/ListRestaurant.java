package com.yash.onlinefood.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.onlinefood.pojo.Restaurant;
import com.yash.onlinefood.repository.RestaurantRepo;
import com.yash.onlinefood.repositoryImpl.RestaurantRepoImpl;

/**
 * Servlet implementation class ListRestaurant
 */
@WebServlet("/listRestaurants")
public class ListRestaurant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	private RestaurantRepo restaurantDAO = new RestaurantRepoImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Restaurant> restaurants = restaurantDAO.getAllRestaurants();
            request.setAttribute("restaurants", restaurants);
            request.getRequestDispatcher("/listRestaurants.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException("Error retrieving restaurants from database", e);
        }
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
