package org.patterns.singleton.multithreading.instanceHolder;

public class Singleton {

    private Singleton() {}

    private static final class InstanceHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return InstanceHolder.instance;
    }
}