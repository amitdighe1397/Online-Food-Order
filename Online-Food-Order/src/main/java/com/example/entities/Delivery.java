package com.example.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int DeliveryID;
	private int OrderID;
	private int Delivery_ExecutiveID;
	private Date Estimated_Delivery_Time;
	private String Delivery_Status;

	public int getDeliveryID() {
		return DeliveryID;
	}

	public void setDeliveryID(int deliveryID) {
		DeliveryID = deliveryID;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public int getDelivery_ExecutiveID() {
		return Delivery_ExecutiveID;
	}

	public void setDelivery_ExecutiveID(int delivery_ExecutiveID) {
		Delivery_ExecutiveID = delivery_ExecutiveID;
	}

	public Date getEstimated_Delivery_Time() {
		return Estimated_Delivery_Time;
	}

	public void setEstimated_Delivery_Time(Date estimated_Delivery_Time) {
		Estimated_Delivery_Time = estimated_Delivery_Time;
	}

	public String getDelivery_Status() {
		return Delivery_Status;
	}

	public void setDelivery_Status(String delivery_Status) {
		Delivery_Status = delivery_Status;
	}

	@Override
	public String toString() {
		return "Delivery [DeliveryID=" + DeliveryID + ", OrderID=" + OrderID + ", Delivery_ExecutiveID="
				+ Delivery_ExecutiveID + ", Estimated_Delivery_Time=" + Estimated_Delivery_Time + ", Delivery_Status="
				+ Delivery_Status + "]";
	}

}
