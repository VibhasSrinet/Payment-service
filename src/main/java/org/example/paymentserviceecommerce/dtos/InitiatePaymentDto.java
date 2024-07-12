package org.example.paymentserviceecommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDto {
    private Long amount;
    private String name;
    private String email;
    private String phoneNumber;
    private String orderId;
}
