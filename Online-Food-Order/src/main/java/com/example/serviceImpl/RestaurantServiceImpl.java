package com.example.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Restaurant;
import com.example.payloads.RestaurantPayload;
import com.example.repositry.RestaurantRepository;
import com.example.service.RestaurantService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Autowired
	private ModelMapper modelMapper;

	public List<RestaurantPayload> getAllRestaurants() {
		List<Restaurant> restaurants = restaurantRepository.findAll();
		return restaurants.stream().map(restaurant -> modelMapper.map(restaurant, RestaurantPayload.class))
				.collect(Collectors.toList());
	}

	public RestaurantPayload getRestaurantById(int restaurantId) {
		Restaurant restaurant = restaurantRepository.findById(restaurantId).orElse(null);
		if (restaurant != null) {
			return modelMapper.map(restaurant, RestaurantPayload.class);
		}
		return null;
	}

	public RestaurantPayload createRestaurant(RestaurantPayload restaurantPayload) {
		Restaurant restaurant = modelMapper.map(restaurantPayload, Restaurant.class);
		Restaurant savedRestaurant = restaurantRepository.save(restaurant);
		return modelMapper.map(savedRestaurant, RestaurantPayload.class);
	}

	public void deleteRestaurant(int restaurantId) {
		restaurantRepository.deleteById(restaurantId);
	}
}
