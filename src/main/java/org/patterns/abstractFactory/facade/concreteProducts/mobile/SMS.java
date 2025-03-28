package org.patterns.abstractFactory.facade.concreteProducts.mobile;

import org.patterns.abstractFactory.facade.abstractProducts.Message;

public class SMS implements Message {
    @Override
    public void send(String message) {
        System.out.println("Sending message: " + message);
    }
}
