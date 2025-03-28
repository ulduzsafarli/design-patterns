package org.patterns.factory.interfaces;

import org.patterns.factory.enums.PaymentType;
import org.patterns.factory.interfaces.impl.CardPayment;
import org.patterns.factory.interfaces.impl.IbanPayment;
import org.patterns.factory.interfaces.impl.PaypalPayment;

public interface PaymentFactory {

    static PaymentMethod getPaymentType(PaymentType paymentType) {
        switch (paymentType.name().toLowerCase()) {
            case "card" -> {
                return new CardPayment();
            }
            case "iban" -> {
                return new IbanPayment();
            }
            case "paypal" -> {
                return new PaypalPayment();
            }
            default -> throw new IllegalArgumentException("Invalid payment type: " + paymentType);

        }
    }

}
