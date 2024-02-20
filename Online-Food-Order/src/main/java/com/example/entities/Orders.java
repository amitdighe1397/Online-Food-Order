package com.example.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

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

	@ManyToOne
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<Item> items;

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private Delivery delivery;

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private Payment payment;

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

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Orders [OrderID=" + OrderID + ", UserID=" + UserID + ", RestaurantID=" + RestaurantID
				+ ", Total_Amount=" + Total_Amount + ", Order_Status=" + Order_Status + ", Order_Date=" + Order_Date
				+ ", user=" + user + ", restaurant=" + restaurant + ", items=" + items + ", delivery=" + delivery
				+ ", payment=" + payment + "]";
	}

}
