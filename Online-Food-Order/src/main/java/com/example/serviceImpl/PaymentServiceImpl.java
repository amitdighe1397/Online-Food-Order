package com.example.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Payment;
import com.example.payloads.PaymentPayload;
import com.example.repositry.PaymentRepository;
import com.example.service.PaymentService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<PaymentPayload> getAllPayments() {
        List<Payment> payments = paymentRepository.findAll();
        return payments.stream()
                .map(payment -> modelMapper.map(payment, PaymentPayload.class))
                .collect(Collectors.toList());
    }

    public PaymentPayload getPaymentById(int paymentId) {
        Payment payment = paymentRepository.findById(paymentId).orElse(null);
        if (payment != null) {
            return modelMapper.map(payment, PaymentPayload.class);
        }
        return null;
    }

    public PaymentPayload createPayment(PaymentPayload paymentPayload) {
        Payment payment = modelMapper.map(paymentPayload, Payment.class);
        Payment savedPayment = paymentRepository.save(payment);
        return modelMapper.map(savedPayment, PaymentPayload.class);
    }

    public void deletePayment(int paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
