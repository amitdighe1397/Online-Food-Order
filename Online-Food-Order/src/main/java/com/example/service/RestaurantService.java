package com.example.service;

import java.util.List;

import com.example.payloads.RestaurantPayload;

public interface RestaurantService {
	List<RestaurantPayload> getAllRestaurants();

	RestaurantPayload getRestaurantById(int restaurantId);

	RestaurantPayload createRestaurant(RestaurantPayload restaurantPayload);

	void deleteRestaurant(int restaurantId);
}
