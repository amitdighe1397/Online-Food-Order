package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.payloads.DeliveryPayload;
import com.example.service.DeliveryService;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;

    @GetMapping
    public ResponseEntity<List<DeliveryPayload>> getAllDeliveries() {
        List<DeliveryPayload> deliveries = deliveryService.getAllDeliveries();
        return ResponseEntity.ok(deliveries);
    }

    @GetMapping("/{deliveryId}")
    public ResponseEntity<DeliveryPayload> getDeliveryById(@PathVariable int deliveryId) {
        DeliveryPayload delivery = deliveryService.getDeliveryById(deliveryId);
        if (delivery != null) {
            return ResponseEntity.ok(delivery);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<DeliveryPayload> createDelivery(@RequestBody DeliveryPayload deliveryPayload) {
        DeliveryPayload createdDelivery = deliveryService.createDelivery(deliveryPayload);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDelivery);
    }

    @DeleteMapping("/{deliveryId}")
    public ResponseEntity<Void> deleteDelivery(@PathVariable int deliveryId) {
        deliveryService.deleteDelivery(deliveryId);
        return ResponseEntity.noContent().build();
    }
}

