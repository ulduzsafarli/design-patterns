package org.patterns.factory.interfaces.impl;

import org.patterns.factory.interfaces.PaymentMethod;

import java.math.BigDecimal;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Paypal Payment: " + amount);
    }
}
