package com.example.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Delivery")
public class Delivery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deliveryId;

	@ManyToOne
	@JoinColumn(name = "orderId")
	private Order order;

	@Column(name = "deliveryExecutiveId")
	private int deliveryExecutiveId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "estimatedDeliveryTime")
	private Date estimatedDeliveryTime;

	@Column(name = "deliveryStatus")
	private String deliveryStatus;

	public int getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getDeliveryExecutiveId() {
		return deliveryExecutiveId;
	}

	public void setDeliveryExecutiveId(int deliveryExecutiveId) {
		this.deliveryExecutiveId = deliveryExecutiveId;
	}

	public Date getEstimatedDeliveryTime() {
		return estimatedDeliveryTime;
	}

	public void setEstimatedDeliveryTime(Date estimatedDeliveryTime) {
		this.estimatedDeliveryTime = estimatedDeliveryTime;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@Override
	public String toString() {
		return "Delivery [deliveryId=" + deliveryId + ", order=" + order + ", deliveryExecutiveId="
				+ deliveryExecutiveId + ", estimatedDeliveryTime=" + estimatedDeliveryTime + ", deliveryStatus="
				+ deliveryStatus + "]";
	}

}
