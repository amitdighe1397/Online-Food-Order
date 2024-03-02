package com.example.payloads;

import java.util.Date;

public class DeliveryPayload {
	private int deliveryId;
	private int orderId;
	private int deliveryExecutiveId;
	private Date estimatedDeliveryTime;
	private String deliveryStatus;

	public int getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
		return "DeliveryPayload [deliveryId=" + deliveryId + ", orderId=" + orderId + ", deliveryExecutiveId="
				+ deliveryExecutiveId + ", estimatedDeliveryTime=" + estimatedDeliveryTime + ", deliveryStatus="
				+ deliveryStatus + "]";
	}

}
