package com.yash.pojo;

import java.sql.Date;
import java.sql.Time;

public class Restaurant {
	
	int id;
    String owner;
    String name;
    String description;
    String cuisineType;
    String address;
    Integer contactInformation;
    Time openingHours;
    String reviews;
    Integer orders;
    Double numRating;
    Date registrationDate;
    boolean open;
    String foods;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCuisineType() {
		return cuisineType;
	}
	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(Integer contactInformation) {
		this.contactInformation = contactInformation;
	}
	public Time getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(Time openingHours) {
		this.openingHours = openingHours;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public Integer getOrders() {
		return orders;
	}
	public void setOrders(Integer orders) {
		this.orders = orders;
	}
	public Double getNumRating() {
		return numRating;
	}
	public void setNumRating(Double numRating) {
		this.numRating = numRating;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public String getFoods() {
		return foods;
	}
	public void setFoods(String foods) {
		this.foods = foods;
	}
	
	public Restaurant(int id, String owner, String name, String description, String cuisineType, String address,
			Integer contactInformation, Time openingHours, String reviews, Integer orders, Double numRating,
			java.util.Date date, boolean open, String foods) {
		super();
		this.id = id;
		this.owner = owner;
		this.name = name;
		this.description = description;
		this.cuisineType = cuisineType;
		this.address = address;
		this.contactInformation = contactInformation;
		this.openingHours = openingHours;
		this.reviews = reviews;
		this.orders = orders;
		this.numRating = numRating;
		this.registrationDate = (Date) date;
		this.open = open;
		this.foods = foods;
	}
	public Restaurant(String parameter, String parameter2, String parameter3, String parameter4, String parameter5,
			int int1, Time valueOf, String parameter6, int int2, double double1, java.util.Date date, boolean boolean1,
			String parameter7) {
		// TODO Auto-generated constructor stub
	}
    
    

}
