package org.patterns.abstractFactory;

import org.patterns.abstractFactory.abstractInterface.Message;
import org.patterns.abstractFactory.abstractInterface.VideoCall;
import org.patterns.abstractFactory.abstractInterface.VoiceCall;

public interface CommunicationFactory {

    Message createMessage();

    VideoCall makeVideoCall();

    VoiceCall makeVoiceCall();

}
