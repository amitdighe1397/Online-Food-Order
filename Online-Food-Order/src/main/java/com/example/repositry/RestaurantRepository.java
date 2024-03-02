package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
