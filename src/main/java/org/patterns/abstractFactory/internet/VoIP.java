package org.patterns.abstractFactory.internet;

import org.patterns.abstractFactory.abstractInterface.VoiceCall;

public class VoIP implements VoiceCall {
    @Override
    public void call(String number) {
        System.out.println("Internet Call to " + number);
    }
}
