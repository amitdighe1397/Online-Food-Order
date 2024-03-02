package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
