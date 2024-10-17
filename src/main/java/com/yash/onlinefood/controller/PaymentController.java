package com.yash.food_delivery.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.yash.food_delivery.dao.PaymentDaoI;
import com.yash.food_delivery.dao.PaymentDaoImp;
import com.yash.food_delivery.pojo.PaymentPojo;
import com.yash.food_delivery.service.PaymentServiceImp;
import com.yash.food_delivery.service.PaymentServiceI;

@WebServlet("/payment")

public class PaymentController extends HttpServlet{
	
	public  void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String name=req.getParameter("payer-name");
		String mode=req.getParameter("payment-mode");
		double amount=(double)Integer.parseInt(req.getParameter("amount"));
		
		
		PaymentPojo pd=new PaymentPojo(name,mode,amount);
		PaymentServiceI ps1=new PaymentServiceImp();
			
		if(ps1.addPay(pd)) {
			res.sendRedirect("PaymentSucess.jsp");
		
		}
		
		
		
		
	}
	
	

}
