package org.patterns.abstractFactory.internet;

import org.patterns.abstractFactory.CommunicationFactory;
import org.patterns.abstractFactory.abstractInterface.Message;
import org.patterns.abstractFactory.abstractInterface.VideoCall;
import org.patterns.abstractFactory.abstractInterface.VoiceCall;

public class InternetCommunicationFactory implements CommunicationFactory {

    @Override
    public Message createMessage() {
        return new WhatsApp();
    }

    @Override
    public VideoCall makeVideoCall() {
        return new Zoom();
    }

    @Override
    public VoiceCall makeVoiceCall() {
        return new VoIP();
    }
}
