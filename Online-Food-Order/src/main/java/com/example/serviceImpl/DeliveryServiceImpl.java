package com.example.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Delivery;
import com.example.payloads.DeliveryPayload;
import com.example.repositry.DeliveryRepository;
import com.example.service.DeliveryService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    @Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<DeliveryPayload> getAllDeliveries() {
        List<Delivery> deliveries = deliveryRepository.findAll();
        return deliveries.stream()
                .map(delivery -> modelMapper.map(delivery, DeliveryPayload.class))
                .collect(Collectors.toList());
    }

    public DeliveryPayload getDeliveryById(int deliveryId) {
        Delivery delivery = deliveryRepository.findById(deliveryId).orElse(null);
        if (delivery != null) {
            return modelMapper.map(delivery, DeliveryPayload.class);
        }
        return null;
    }

    public DeliveryPayload createDelivery(DeliveryPayload deliveryPayload) {
        Delivery delivery = modelMapper.map(deliveryPayload, Delivery.class);
        Delivery savedDelivery = deliveryRepository.save(delivery);
        return modelMapper.map(savedDelivery, DeliveryPayload.class);
    }

    public void deleteDelivery(int deliveryId) {
        deliveryRepository.deleteById(deliveryId);
    }
}
