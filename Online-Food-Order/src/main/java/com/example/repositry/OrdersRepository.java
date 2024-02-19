package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
