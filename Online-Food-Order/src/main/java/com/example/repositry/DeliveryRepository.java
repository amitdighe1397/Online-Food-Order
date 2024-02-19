package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

}
