package org.patterns.abstractFactory.internet;

import org.patterns.abstractFactory.abstractInterface.Message;

public class WhatsApp implements Message {
    @Override
    public void send(String message) {
        System.out.println("Sending message: " + message);
    }
}
