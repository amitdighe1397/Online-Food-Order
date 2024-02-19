package com.example.payloads;

public class ItemPayloads {

	private int ItemID;
	private int OrderID;
	private String Name;
	private int Quantity;
	private double Price;

	public int getItemID() {
		return ItemID;
	}

	public void setItemID(int itemID) {
		ItemID = itemID;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "ItemPayloads [ItemID=" + ItemID + ", OrderID=" + OrderID + ", Name=" + Name + ", Quantity=" + Quantity
				+ ", Price=" + Price + "]";
	}

}
