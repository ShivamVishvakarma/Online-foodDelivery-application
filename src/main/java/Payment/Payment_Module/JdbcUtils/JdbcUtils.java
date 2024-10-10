package com.yash.JdbcUtils;


import java.sql.*;

public class JdbcUtils {
	
	    static final String URL = "jdbc:mysql://localhost:3306/payment_module";
	    static final String USER = "root";
	    static final String PASSWORD = "Password@2024";
	    
	    static {
	    	try {
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    	}
	    	catch(ClassNotFoundException e) {
	    		e.printStackTrace();
	    	}
	    }
	    
	    Connection con=null;
	    
	    public Connection openConnection() {
	    	try {
	    	if(con==null) {
	    		con=DriverManager.getConnection(URL,USER,PASSWORD);
	    	}
	    	
	    	if(con.isClosed()) {
	    		con=DriverManager.getConnection(URL,USER,PASSWORD);
	    	}
	       	
	    	}
	    	catch(Exception e) {
	    		System.out.println("This is in conn");
	    		e.printStackTrace();
	    	}
	    	return con;
	    }
	
	   
	    public PreparedStatement createPrepareStatment(String q) 
	    {
	    	try {
	    		return openConnection().prepareStatement(q);
	    	}
	    	catch(SQLException e) {
	    		System.out.print("in prepared");
	    		e.printStackTrace();
	    	}
			return null;
	    }
	    
	    public void closeConnection(PreparedStatement pst) {
	    	
	    	try {
	    		pst.close();
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    }
	    
	    
	

}
