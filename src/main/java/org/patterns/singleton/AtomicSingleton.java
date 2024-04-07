package org.patterns.singleton;

import java.util.concurrent.atomic.AtomicReference;

//AtomicReference for multithreading
public class AtomicSingleton {
    private static final AtomicReference<AtomicSingleton> INSTANCE = new AtomicReference<>();

    private AtomicSingleton() {
    }

    public static AtomicSingleton getInstance() {
        AtomicSingleton instance = INSTANCE.get();
        if (instance == null) {
            instance = new AtomicSingleton();
            if (INSTANCE.compareAndSet(null, instance)) {
                return instance;
            } else {
                INSTANCE.get();
            }
        }
        return instance;
    }
}
