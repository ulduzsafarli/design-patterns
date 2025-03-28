package org.patterns.abstractFactory.facade.concreteProducts.mobile;

import org.patterns.abstractFactory.facade.abstractProducts.VideoCall;

public class FaceTime implements VideoCall {
    @Override
    public void startVideo(String participant) {
        System.out.println("Starting video with " + participant);
    }
}
