package com.yash.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.Repository.RestaurantRepo;
import com.yash.RepositoryImpl.RestaurantRepoImpl;
import com.yash.pojo.Restaurant;


@WebServlet("/readRestaurents")
public class ReadRestaurent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
		
		 private RestaurantRepo restaurantDAO = new RestaurantRepoImpl();

		    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        try {
		            int id = Integer.parseInt(request.getParameter("id"));
		            Restaurant restaurant = restaurantDAO.getRestaurant(id);
		            request.setAttribute("restaurant", restaurant);
		            request.getRequestDispatcher("/WEB-INF/views/restaurantDetails.jsp").forward(request, response);
		        } catch (SQLException e) {
		            throw new ServletException(e);
		        }
		    }
		
	}


