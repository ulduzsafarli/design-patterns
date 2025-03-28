package org.patterns.factory;

import org.patterns.factory.enums.PaymentType;
import org.patterns.factory.interfaces.PaymentFactory;
import org.patterns.factory.interfaces.PaymentMethod;

import java.math.BigDecimal;

public class FactoryExample {
    public static void main(String[] args) {
        PaymentMethod cardPayment = PaymentFactory.getPaymentType(PaymentType.CARD);
        cardPayment.processPayment(BigDecimal.valueOf(1000.00));

        PaymentMethod ibanPayment = PaymentFactory.getPaymentType(PaymentType.IBAN);
        ibanPayment.processPayment(BigDecimal.valueOf(2000.00));

        PaymentMethod paypalPayment = PaymentFactory.getPaymentType(PaymentType.PAYPAL);
        paypalPayment.processPayment(BigDecimal.valueOf(3000.00));


    }
}
