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

/**
 * Servlet implementation class DeleteRestaurant
 */
@WebServlet("/deleteRestaurants")
public class DeleteRestaurant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	private RestaurantRepo restaurantDAO = new RestaurantRepoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            restaurantDAO.deleteRestaurant(id);
            response.sendRedirect("listRestaurants");
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

	

}
