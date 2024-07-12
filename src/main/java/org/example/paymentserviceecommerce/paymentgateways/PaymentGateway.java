package org.example.paymentserviceecommerce.paymentgateways;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String getPaymentLink(Long amount,String name, String email, String phoneNumber, String orderId) throws RazorpayException;
}
