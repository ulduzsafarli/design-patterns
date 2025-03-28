package org.patterns.abstractFactory.mobile;

import org.patterns.abstractFactory.abstractInterface.Message;

public class SMS implements Message {
    @Override
    public void send(String message) {
        System.out.println("Sending message: " + message);
    }
}
