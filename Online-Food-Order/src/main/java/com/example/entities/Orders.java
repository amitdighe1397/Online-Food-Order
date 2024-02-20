package com.example.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {

	private int OrderID;
	private int UserID;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int RestaurantID;

	private double Total_Amount;
	private String Order_Status;
	private Date Order_Date;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getRestaurantID() {
		return RestaurantID;
	}

	public void setRestaurantID(int restaurantID) {
		RestaurantID = restaurantID;
	}

	public double getTotal_Amount() {
		return Total_Amount;
	}

	public void setTotal_Amount(double total_Amount) {
		Total_Amount = total_Amount;
	}

	public String getOrder_Status() {
		return Order_Status;
	}

	public void setOrder_Status(String order_Status) {
		Order_Status = order_Status;
	}

	public Date getOrder_Date() {
		return Order_Date;
	}

	public void setOrder_Date(Date order_Date) {
		Order_Date = order_Date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Orders [OrderID=" + OrderID + ", UserID=" + UserID + ", RestaurantID=" + RestaurantID
				+ ", Total_Amount=" + Total_Amount + ", Order_Status=" + Order_Status + ", Order_Date=" + Order_Date
				+ ", user=" + user + "]";
	}

}
