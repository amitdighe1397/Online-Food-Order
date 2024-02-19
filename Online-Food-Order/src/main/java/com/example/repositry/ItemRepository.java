package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
