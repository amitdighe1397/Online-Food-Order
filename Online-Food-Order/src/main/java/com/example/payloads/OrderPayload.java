package com.example.payloads;

import java.util.Date;

public class OrderPayload {
	private int orderId;
	private int userId;
	private int restaurantId;
	private double totalAmount;
	private String orderStatus;
	private Date orderDate;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "OrderPayload [orderId=" + orderId + ", userId=" + userId + ", restaurantId=" + restaurantId
				+ ", totalAmount=" + totalAmount + ", orderStatus=" + orderStatus + ", orderDate=" + orderDate + "]";
	}

}
