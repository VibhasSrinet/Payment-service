package org.example.paymentserviceecommerce.paymentgateways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class PaymentGatewayStrategy {
    @Autowired
    private PaymentGateway paymentGateway;

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }
}

