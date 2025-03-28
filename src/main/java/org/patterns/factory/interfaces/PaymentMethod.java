package org.patterns.factory.interfaces;

import java.math.BigDecimal;

public interface PaymentMethod {

    void processPayment(BigDecimal amount);

}
