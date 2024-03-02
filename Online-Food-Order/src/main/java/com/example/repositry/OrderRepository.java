package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
