package com.example.payloads;

public class RestaurantPayloads {

	private int RestaurantID;
	private String Name;
	private String Location;
	private String Cuisine;
	private double Rating;

	public int getRestaurantID() {
		return RestaurantID;
	}

	public void setRestaurantID(int restaurantID) {
		RestaurantID = restaurantID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getCuisine() {
		return Cuisine;
	}

	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}

	public double getRating() {
		return Rating;
	}

	public void setRating(double rating) {
		Rating = rating;
	}

	@Override
	public String toString() {
		return "RestaurantPayloads [RestaurantID=" + RestaurantID + ", Name=" + Name + ", Location=" + Location
				+ ", Cuisine=" + Cuisine + ", Rating=" + Rating + "]";
	}

}
