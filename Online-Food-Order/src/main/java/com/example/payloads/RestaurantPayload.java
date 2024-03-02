package com.example.payloads;

public class RestaurantPayload {
	private int restaurantId;
	private String name;
	private String location;
	private String cuisineType;
	private double rating;

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "RestaurantPayload [restaurantId=" + restaurantId + ", name=" + name + ", location=" + location
				+ ", cuisineType=" + cuisineType + ", rating=" + rating + "]";
	}

}
