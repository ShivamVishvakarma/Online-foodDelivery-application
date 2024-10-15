package com.yash.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.Repository.RestaurantRepo;
import com.yash.RepositoryImpl.RestaurantRepoImpl;
import com.yash.pojo.Restaurant;

/**
 * Servlet implementation class UpdateRestaurent
 */
@WebServlet("/updateRestaurant")
public class UpdateRestaurent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	private RestaurantRepo restaurantDAO = new RestaurantRepoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Restaurant restaurant = new Restaurant(
                Integer.parseInt(request.getParameter("id")),
                request.getParameter("owner"),
                request.getParameter("name"),
                request.getParameter("description"),
                request.getParameter("cuisineType"),
                request.getParameter("address"),
                Integer.parseInt(request.getParameter("contactInformation")),
                Time.valueOf(request.getParameter("openingHours")),
                request.getParameter("reviews"),
                Integer.parseInt(request.getParameter("orders")),
                Double.parseDouble(request.getParameter("numRating")),
                new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("registrationDate")),
                Boolean.parseBoolean(request.getParameter("open")),
                request.getParameter("foods")
            );

            restaurantDAO.updateRestaurant(restaurant);
            response.sendRedirect("listRestaurants");
        } catch (SQLException | ParseException e) {
            throw new ServletException(e);
        }
    }

}
