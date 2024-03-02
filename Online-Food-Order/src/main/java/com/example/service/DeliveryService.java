package com.example.service;

import java.util.List;

import com.example.payloads.DeliveryPayload;

public interface DeliveryService {
	List<DeliveryPayload> getAllDeliveries();

	DeliveryPayload getDeliveryById(int deliveryId);

	DeliveryPayload createDelivery(DeliveryPayload deliveryPayload);

	void deleteDelivery(int deliveryId);
}
