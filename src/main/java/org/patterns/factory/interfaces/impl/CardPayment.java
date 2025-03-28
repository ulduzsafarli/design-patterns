package org.patterns.factory.interfaces.impl;

import org.patterns.factory.interfaces.PaymentMethod;

import java.math.BigDecimal;

public class CardPayment implements PaymentMethod {

    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Card Payment: " + amount);
    }
}
