package com.yash.pojo;

public class Payment_details {
	private String name;
	private String mode;
	private double amount;
	
	public Payment_details(String name, String mode ,double amount) {
		this.name = name;
		this.mode = mode;
		this.amount=amount;
		
	}
	public double getAmount() {
		return amount;
	};
	public void setAmount(double amount) {
		
		this.amount = amount;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
		
	}
	

}
