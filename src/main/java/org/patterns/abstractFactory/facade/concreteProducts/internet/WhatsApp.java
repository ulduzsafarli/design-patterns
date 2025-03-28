package org.patterns.abstractFactory.facade.concreteProducts.internet;

import org.patterns.abstractFactory.facade.abstractProducts.Message;

public class WhatsApp implements Message {
    @Override
    public void send(String message) {
        System.out.println("Sending message: " + message);
    }
}
