package org.patterns.abstractFactory.internet;

import org.patterns.abstractFactory.abstractInterface.VideoCall;

public class Zoom implements VideoCall {
    @Override
    public void startVideo(String participant) {
        System.out.println("Starting video with " + participant);
    }
}
