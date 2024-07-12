package org.example.paymentserviceecommerce.services;

import com.razorpay.RazorpayException;
import org.example.paymentserviceecommerce.paymentgateways.PaymentGatewayStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentGatewayStrategy paymentGatewayStrategy;

    public String initiatePayment(Long amount, String name, String email, String phoneNumber, String orderId) throws RazorpayException {
        return paymentGatewayStrategy.getPaymentGateway().getPaymentLink(amount, name, email, phoneNumber, orderId);
    }
}
