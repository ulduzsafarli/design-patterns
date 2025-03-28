package org.patterns.singleton.multithreading.concurent;

import java.util.concurrent.ConcurrentHashMap;

//ConcurrentHashMap for multithreading
public class Singleton {
    private static final ConcurrentHashMap<String, Singleton> instances = new ConcurrentHashMap<>();

    private Singleton() {
    }

    public Singleton getInstance() {
        return instances.computeIfAbsent("INSTANCE", key -> new Singleton());
    }
}
