package org.patterns.abstractFactory.mobile;

import org.patterns.abstractFactory.abstractInterface.VoiceCall;

public class MobileCall implements VoiceCall {
    @Override
    public void call(String number) {
        System.out.println("Calling mobile: " + number);
    }
}
