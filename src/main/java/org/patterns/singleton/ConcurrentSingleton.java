package org.patterns.singleton;

import java.util.concurrent.ConcurrentHashMap;

//ConcurrentHashMap for multithreading
public class ConcurrentSingleton {
    private static final ConcurrentHashMap<String, ConcurrentSingleton> instances = new ConcurrentHashMap<>();

    private ConcurrentSingleton() {
    }

    public ConcurrentSingleton getInstance() {
        return instances.computeIfAbsent("INSTANCE", key -> new ConcurrentSingleton());
    }
}
