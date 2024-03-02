package com.example.service;

import java.util.List;

import com.example.payloads.PaymentPayload;

public interface PaymentService {
	List<PaymentPayload> getAllPayments();

	PaymentPayload getPaymentById(int paymentId);

	PaymentPayload createPayment(PaymentPayload paymentPayload);

	void deletePayment(int paymentId);
}
