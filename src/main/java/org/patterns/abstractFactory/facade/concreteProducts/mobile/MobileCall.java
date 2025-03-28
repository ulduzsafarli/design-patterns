package org.patterns.abstractFactory.facade.concreteProducts.mobile;

import org.patterns.abstractFactory.facade.abstractProducts.VoiceCall;

public class MobileCall implements VoiceCall {
    @Override
    public void call(String number) {
        System.out.println("Calling mobile: " + number);
    }
}
