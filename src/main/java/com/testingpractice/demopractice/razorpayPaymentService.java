package com.testingpractice.demopractice;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class razorpayPaymentService implements paymentService {
    @Override
    @GetMapping("/stripe")
    public String pay() {
        String payment= "Razorpay";
        System.out.println("payemnt from " +payment);
        return payment;
    }

}
