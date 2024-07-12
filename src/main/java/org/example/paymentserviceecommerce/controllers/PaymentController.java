package org.example.paymentserviceecommerce.controllers;


import org.example.paymentserviceecommerce.services.PaymentService;
import org.example.paymentserviceecommerce.dtos.InitiatePaymentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDto initiatePaymentDto) {
        try {
            return paymentService.initiatePayment(initiatePaymentDto.getAmount(), initiatePaymentDto.getName(), initiatePaymentDto.getEmail(), initiatePaymentDto.getPhoneNumber(), initiatePaymentDto.getOrderId());
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
