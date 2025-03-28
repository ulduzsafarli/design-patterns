package org.patterns.abstractFactory.facade.concreteProducts.internet;

import org.patterns.abstractFactory.facade.abstractProducts.VoiceCall;

public class VoIP implements VoiceCall {
    @Override
    public void call(String number) {
        System.out.println("Internet Call to " + number);
    }
}
