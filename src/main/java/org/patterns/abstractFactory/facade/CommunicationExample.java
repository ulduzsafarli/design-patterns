package org.patterns.abstractFactory.facade;

import org.patterns.abstractFactory.facade.abstractProducts.Message;
import org.patterns.abstractFactory.facade.abstractProducts.VideoCall;
import org.patterns.abstractFactory.facade.abstractProducts.VoiceCall;
import org.patterns.abstractFactory.facade.enums.CommunicationTypes;
import org.patterns.abstractFactory.facade.factory.CommunicationFactory;
import org.patterns.abstractFactory.facade.concreteProducts.internet.InternetCommunicationFactory;
import org.patterns.abstractFactory.facade.concreteProducts.mobile.MobileCommunicationFactory;

public class CommunicationExample {
    public static void main(String[] args) {
        CommunicationFactory factory;

        //Mobile Communication
        System.out.println("\nMobile Communication Example");
        factory = new MobileCommunicationFactory();
        Message message = factory.createMessage();
        VoiceCall call = factory.makeVoiceCall();
        VideoCall videoCall = factory.makeVideoCall();

        message.send("Hello!");
        call.call("+123456789");
        videoCall.startVideo("Friend");

        //Internet Communication
        System.out.println("\nInternet Communication Example");
        factory = new InternetCommunicationFactory();
        message = factory.createMessage();
        call = factory.makeVoiceCall();
        videoCall = factory.makeVideoCall();

        message.send("Hello from Telegram!");
        call.call("user123");
        videoCall.startVideo("team_meeting");

        // Initialize facade for "internet" or "mobile"
        System.out.println("\nInternet Communication Example");
        CommunicationFacade internetComm = new CommunicationFacade(CommunicationTypes.INTERNET);
        internetComm.sendMessage("Hello via WhatsApp!");
        internetComm.makeCall("user123");
        internetComm.startVideoCall("team_meeting");

        // Switch to mobile seamlessly
        System.out.println("\nMobile Communication Example");
        CommunicationFacade mobileComm = new CommunicationFacade(CommunicationTypes.MOBILE);
        mobileComm.sendMessage("SMS sent!");
        mobileComm.makeCall("+123456789");
    }
}
