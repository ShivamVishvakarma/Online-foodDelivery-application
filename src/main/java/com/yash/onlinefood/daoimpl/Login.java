package com.yash.onlinefood.daoimpl;


	
	import java.io.IOException;
import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.onlinefood.domain.User;
import com.yash.onlinefood.util.DatabaseUtil;



	@WebServlet("/login")
	public class Login extends HttpServlet{  

	    protected void service(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        PrintWriter out = response.getWriter();
	        response.setContentType("text/html");

	        String email = request.getParameter("email");
	        String password = request.getParameter("password");

	        try {
	        	
	        	DatabaseUtil con=new DatabaseUtil();
	            String query = "SELECT * FROM users WHERE email=? AND password=?";
	            PreparedStatement ps = con.createPreparedStatement(query);
	            ps.setString(1, email);
	            ps.setString(2, password);

	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                
	            	User user = new User();
	              
	            	user.setName(rs.getString("name"));
	            	user.setEmail(rs.getString("email"));
	               
	              
	                HttpSession session = request.getSession();
	                session.setAttribute("session_User", user);

	                
	                RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
	                rd.forward(request, response);
	            } else {
	                
	                out.println("<h3 style='color:red'>Email id and password didn't match</h3>");
	                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
	                rd.include(request, response);
	            }

	           
//	            rs.close();
//	            ps.close();
//	            con.close();

	        } catch (SQLException e) {
	           
	            out.println("<h3 style='color:red'>Database error: " + e.getMessage() + "</h3>");
	            e.printStackTrace();
	        } 
	        catch (Exception e) {
	            
	            out.println("<h3 style='color:red'>Error: " + e.getMessage() + "</h3>");
	            e.printStackTrace();
	        }
	    }
	}


