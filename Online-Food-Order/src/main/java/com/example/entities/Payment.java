package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int PaymentID;
	private int OrderID;
	private double Amount;
	private String Payment_Method;
	private String Payment_Status;
	private int orders_OrderId;

	public int getPaymentID() {
		return PaymentID;
	}

	public void setPaymentID(int paymentID) {
		PaymentID = paymentID;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getPayment_Method() {
		return Payment_Method;
	}

	public void setPayment_Method(String payment_Method) {
		Payment_Method = payment_Method;
	}

	public String getPayment_Status() {
		return Payment_Status;
	}

	public void setPayment_Status(String payment_Status) {
		Payment_Status = payment_Status;
	}

	public int getOrders_OrderId() {
		return orders_OrderId;
	}

	public void setOrders_OrderId(int orders_OrderId) {
		this.orders_OrderId = orders_OrderId;
	}

	@Override
	public String toString() {
		return "Payment [PaymentID=" + PaymentID + ", OrderID=" + OrderID + ", Amount=" + Amount + ", Payment_Method="
				+ Payment_Method + ", Payment_Status=" + Payment_Status + ", orders_OrderId=" + orders_OrderId + "]";
	}

}
