package com.example.payloads;

public class ItemPayload {
	private int itemId;
	private int orderId;
	private String name;
	private int quantity;
	private double price;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemPayload [itemId=" + itemId + ", orderId=" + orderId + ", name=" + name + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}
