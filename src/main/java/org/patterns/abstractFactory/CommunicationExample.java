package org.patterns.abstractFactory;

import org.patterns.abstractFactory.abstractInterface.Message;
import org.patterns.abstractFactory.abstractInterface.VideoCall;
import org.patterns.abstractFactory.abstractInterface.VoiceCall;
import org.patterns.abstractFactory.internet.InternetCommunicationFactory;
import org.patterns.abstractFactory.mobile.MobileCommunicationFactory;

public class CommunicationExample {
    public static void main(String[] args) {
        CommunicationFactory factory;

        //Mobile Communication
        factory = new MobileCommunicationFactory();
        Message message = factory.createMessage();
        VoiceCall call = factory.makeVoiceCall();
        VideoCall videoCall = factory.makeVideoCall();

        message.send("Hello!");
        call.call("+123456789");
        videoCall.startVideo("Friend");

        //Internet Communication
        factory = new InternetCommunicationFactory();
        message = factory.createMessage();
        call = factory.makeVoiceCall();
        videoCall = factory.makeVideoCall();

        message.send("Hello from Telegram!");
        call.call("user123");
        videoCall.startVideo("team_meeting");
    }
}
