package org.patterns.abstractFactory.facade.concreteProducts.mobile;

import org.patterns.abstractFactory.facade.factory.CommunicationFactory;
import org.patterns.abstractFactory.facade.abstractProducts.Message;
import org.patterns.abstractFactory.facade.abstractProducts.VideoCall;
import org.patterns.abstractFactory.facade.abstractProducts.VoiceCall;

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
