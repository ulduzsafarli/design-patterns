package org.patterns.abstractFactory.mobile;

import org.patterns.abstractFactory.factory.CommunicationFactory;
import org.patterns.abstractFactory.abstractInterface.Message;
import org.patterns.abstractFactory.abstractInterface.VideoCall;
import org.patterns.abstractFactory.abstractInterface.VoiceCall;

public class MobileCommunicationFactory implements CommunicationFactory {


    @Override
    public Message createMessage() {
        return new SMS();
    }

    @Override
    public VideoCall makeVideoCall() {
        return new FaceTime();
    }

    @Override
    public VoiceCall makeVoiceCall() {
        return new MobileCall();
    }
}
