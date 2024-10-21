package com.yash.food_delivery.controller;

import java.io.BufferedReader; 
import java.io.IOException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import org.json.JSONObject; 

import org.json.JSONObject;


@WebServlet("/BillerCounter")

public class BillerController extends HttpServlet {
	
	
	public void service(HttpServletRequest req , HttpServletResponse resp) throws IOException {
	
	        resp.setContentType("application/json");
	        
	        StringBuilder sb = new StringBuilder();
	        String line;
	        try (BufferedReader reader = req.getReader()) {
	            while ((line = reader.readLine()) != null) {
	                sb.append(line);
	            }
	        }

	
	        if (sb.length() == 0) {
	            System.out.println("Received empty request body");
	            return;
	        }

	        
	        try {
	            JSONObject json = new JSONObject(sb.toString());
	            String paymentId = json.getString("paymentId");
	            String orderId = json.getString("orderId");

	            System.out.println("Received Payment ID: " + paymentId);
	            System.out.println("Received Order ID: " + orderId);

	            // Here you can add logic to process the payment details, e.g., save to database

	           } 
	        catch (Exception e) {
	            System.out.println("Error parsing JSON: " + e.getMessage());
	          
	        }
	    }
	 
	  
		
		
		
	}


