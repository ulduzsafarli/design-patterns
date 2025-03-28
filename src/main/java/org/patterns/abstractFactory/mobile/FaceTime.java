package org.patterns.abstractFactory.mobile;

import org.patterns.abstractFactory.abstractInterface.VideoCall;

public class FaceTime implements VideoCall {
    @Override
    public void startVideo(String participant) {
        System.out.println("Starting video with " + participant);
    }
}
