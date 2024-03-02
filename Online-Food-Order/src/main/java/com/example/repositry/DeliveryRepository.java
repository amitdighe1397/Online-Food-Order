package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

}

