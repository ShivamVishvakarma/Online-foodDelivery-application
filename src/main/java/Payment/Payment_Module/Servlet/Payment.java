package com.yash.Servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.yash.Dao.Dao;
import com.yash.Dao.ImpDao;
import com.yash.pojo.Payment_details;

@WebServlet("/payment")

public class Payment extends HttpServlet{
	
	public  void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String name=req.getParameter("payer-name");
		String mode=req.getParameter("payment-mode");
		double amount=(double)Integer.parseInt(req.getParameter("amount"));
		
		
		Payment_details pd=new Payment_details(name,mode,amount);
		Dao d=new ImpDao();
		
		if(d.addPayment(pd)) {
			res.sendRedirect("landing.jsp");
		}
		
		
		
	}
	
	

}
