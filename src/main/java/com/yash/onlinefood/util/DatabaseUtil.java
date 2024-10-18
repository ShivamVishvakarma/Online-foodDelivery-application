package com.yash.onlinefood.util;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	 

public class DatabaseUtil {
	
		 static final String url="jdbc:mysql://localhost:3306/food_delivary";
		    static final String user="root";
		    static final String pass="root";
	 
	 
		    //loading Driver
		    static
		    {
		        try
		        {
		          Class.forName("com.mysql.cj.jdbc.Driver");
		            System.out.println("debug driver");
		        }
		        catch (ClassNotFoundException e)
		        {
		            e.printStackTrace();
		        }
		    }
	 
	 
		    // creating connection
		    private Connection con=null;
	 
		    public Connection openConnection()
		    {
		        try
		        {
		            if(con==null)
		            {
		                con=DriverManager.getConnection(url,user,pass);
	 
		            }
		            if(con.isClosed())
		            {
		                con=DriverManager.getConnection(url,user,pass);
		            }
		            System.out.println("connection successful");
		        }
		        catch (SQLException ex)
		        {
		            ex.printStackTrace();
		        }
		        return con;
		    }
	 
	 
		    //cretaing prepared statement for sql query
	 
		    public PreparedStatement createPreparedStatement(String sql)
		    {
		        try
		        {
		            return openConnection().prepareStatement(sql);
		        }
		        catch (SQLException sqlException)
		        {
		            sqlException.printStackTrace();
		            throw  new RuntimeException(sqlException.getMessage());
		        }
		    }
	 
		    public void closepreparedstatement(PreparedStatement pst)
		    {
		        try
		        {
		            pst.close();
		        }
		        catch (SQLException ex2)
		        {
		            ex2.printStackTrace();
		        }
		    }
	 
	 
		    public ResultSet createResultSet(String query)
		    {
		        try
		        {
		            return openConnection().createStatement().executeQuery(query);
		        }
		        catch (SQLException ex)
		        {
		            ex.printStackTrace();
		            throw new RuntimeException(ex.getMessage());
		        }
		    }
		    public int executeUpdate(String query)
		    {
		        try (Connection conn = openConnection();
		             PreparedStatement pstmt = conn.prepareStatement(query)) 
		        {
		            return pstmt.executeUpdate();
		        }
		        catch (SQLException ex) 
		        {
		            System.out.println("problem here!");
		            ex.printStackTrace();
		            throw new RuntimeException(ex.getMessage());
		        }
		    }
	 
	 
		    public void closeResultSet(ResultSet rst)
		    {
		        try
		        {
		            rst.close();
		        }
		        catch (SQLException ex)
		        {
		            ex.printStackTrace();
		        }
		    }
	 
	 
		    //close connection
	 
		    public void closeConnection(Connection con)
		    {
		        try
		        {
		            con.close();
		        } 
		        catch (SQLException e) {
	 
		        }
		    }
	}   

