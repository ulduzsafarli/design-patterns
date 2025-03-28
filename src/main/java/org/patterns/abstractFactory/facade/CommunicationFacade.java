package org.patterns.abstractFactory.facade;

import org.patterns.abstractFactory.enums.CommunicationTypes;
import org.patterns.abstractFactory.factory.CommunicationFactory;
import org.patterns.abstractFactory.internet.InternetCommunicationFactory;
import org.patterns.abstractFactory.mobile.MobileCommunicationFactory;

public class CommunicationFacade {
    private final CommunicationFactory factory;

    public CommunicationFacade(CommunicationTypes types) {
        this.factory =
                switch (types.name().toLowerCase()) {
                    case "mobile" -> new MobileCommunicationFactory();
                    case "internet" -> new InternetCommunicationFactory();
                    default -> throw new IllegalStateException("Unexpected value: " + types.name().toLowerCase());
                }
        ;
    }

    // Simplified high-level methods
    public void sendMessage(String text) {
        factory.createMessage().send(text);
    }

    public void makeCall(String number) {
        factory.makeVoiceCall().call(number);
    }

    public void startVideoCall(String participant) {
        factory.makeVideoCall().startVideo(participant);
    }
}
