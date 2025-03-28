package org.patterns.abstractFactory.facade.factory;

import org.patterns.abstractFactory.facade.abstractProducts.Message;
import org.patterns.abstractFactory.facade.abstractProducts.VideoCall;
import org.patterns.abstractFactory.facade.abstractProducts.VoiceCall;

public interface CommunicationFactory {

    Message createMessage();

    VideoCall makeVideoCall();

    VoiceCall makeVoiceCall();

}
