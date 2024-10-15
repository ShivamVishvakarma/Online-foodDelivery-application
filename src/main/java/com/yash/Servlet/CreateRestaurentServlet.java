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


@WebServlet("/createRestaurant")
public class CreateRestaurentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    RestaurantRepo dao = new RestaurantRepoImpl();
  


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
		Restaurant restaurent = new Restaurant(
				
				request.getParameter("owner"),
				request.getParameter("name"),
				request.getParameter("description"),
				request.getParameter("cuisuinType"),
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
		
               dao.addRestaurant(restaurent);
               response.sendRedirect("listRestaurents");
		}catch(SQLException | ParseException e) {
			throw new ServletException(e);
		}
				
		
		
	}

}
