package FeedBack_Module.JDBC_Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Utils {
	static final String URL = "jdbc:mysql://localhost:3306/feedback_module";
    static final String USER = "root";
    static final String PASSWORD = "root";
    
   public static Connection getConnection() throws SQLException {
//    	try {
//    		Class.forName("com.mysql.cj.jdbc.Driver");
//    	}
//    	catch(ClassNotFoundException e) {
//    		e.printStackTrace();
//    	}
	   return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
//    Connection con=null;
//    
//    public Connection openConnection() {
//    	try {
//    	if(con==null) {
//    		con=DriverManager.getConnection(URL,USER,PASSWORD);
//    	}
//    	
//    	if(con.isClosed()) {
//    		con=DriverManager.getConnection(URL,USER,PASSWORD);
//    	}
//       	
//    	}
//    	catch(Exception e) {
//    		System.out.println("This is in conn");
//    		e.printStackTrace();
//    	}
//    	return con;
//    }
//
//   
//    public PreparedStatement createPrepareStatment(String q) 
//    {
//    	try {
//    		return openConnection().prepareStatement(q);
//    	}
//    	catch(SQLException e) {
//    		System.out.print("In prepared Statement");
//    		e.printStackTrace();
//    	}
//		return null;
//    }
//    
//    public void closeConnection(PreparedStatement pst) {
//    	
//    	try {
//    		pst.close();
//    	}
//    	catch(Exception e) {
//    		e.printStackTrace();
//    	}
//    	
//    }
//    
//}
