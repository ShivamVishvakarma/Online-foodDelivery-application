package payment.yash.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import payment.yash.JdbcUtils.JdbcUtils;
import payment.yash.pojo.Payment_details;

public class ImpDao implements Dao {
	JdbcUtils db; 
	public ImpDao() {
		db=new JdbcUtils();	
	}
	
	@Override
	public boolean addPayment(Payment_details pd) {
		
		System.out.println(pd.getName());
		System.out.println(pd.getMode());
		System.out.println(pd.getAmount());
	
		
		String q="insert into payment (name,mode,amount) values(? ,? , ?)";
		PreparedStatement pst=db.createPrepareStatment(q);
	
		
		try {	
			System.out.println("hrlll");
			pst.setString(1,pd.getName());
			pst.setString(2,pd.getMode());
			pst.setDouble(3,pd.getAmount());
			pst.execute();
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		return false;
	}
	
//	@Override
//	public boolean checkStatus(Payment_details pd) {
//		
//		return false;
//	}
	
}
