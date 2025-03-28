package org.patterns.abstractFactory.facade.concreteProducts.internet;

import org.patterns.abstractFactory.facade.abstractProducts.VideoCall;

public class Zoom implements VideoCall {
    @Override
    public void startVideo(String participant) {
        System.out.println("Starting video with " + participant);
    }
}
