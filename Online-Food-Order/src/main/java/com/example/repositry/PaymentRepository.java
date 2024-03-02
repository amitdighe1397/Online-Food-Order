package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
