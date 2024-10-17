package com.yash.onlinefood.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Utils {
	static final String URL = "jdbc:mysql://localhost:3306/foodDelivery_feedback_module";
    static final String USER = "root";
    static final String PASSWORD = "root";
    
   public static Connection getConnection() throws SQLException {

	   return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
