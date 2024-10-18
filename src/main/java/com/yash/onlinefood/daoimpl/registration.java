package com.yash.onlinefood.daoimpl;




import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.onlinefood.util.DatabaseUtil;


@WebServlet("/jsp/user")
	public class registration  extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    public registration() {
	        super();
	    }

	    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        PrintWriter out = response.getWriter();
	        response.setContentType("text/html");

	        String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        String confirm_password = request.getParameter("confirm_password");
	      out.print(name);

	        try {
	           DatabaseUtil con=new DatabaseUtil();
	            String insert_sql_query = "INSERT INTO users VALUES (?, ?, ?)";
	            out.print(insert_sql_query);
	            PreparedStatement ps = con.createPreparedStatement(insert_sql_query);
	            ps.setString(1, name);
	            ps.setString(2, email);
	            ps.setString(3, password);
	            out.println(ps);
	            int count = ps.executeUpdate();
	            if (count > 0) {
	            	out.println("ros added succesfully");
	                RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
	                rd.forward(request, response);
	            } else {
	                out.println("<h3 style='color:red'>Registration Failed</h3>");
	                RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
	                rd.include(request, response);
	            }


	        } catch (SQLException e) {
	        	out.println("i am here");
	            out.println("<h3 style='color:red'>An error occurred: " + e.getMessage() + "</h3>");
	            e.printStackTrace();
	        }
	    }
	}


