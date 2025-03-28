package org.patterns.singleton.multithreading.atomic;

import java.util.concurrent.atomic.AtomicReference;

//AtomicReference for multithreading
public class Singleton {
    private static final AtomicReference<Singleton> INSTANCE = new AtomicReference<>();

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton instance = INSTANCE.get();
        if (instance == null) {
            instance = new Singleton();
            if (INSTANCE.compareAndSet(null, instance)) {
                return instance;
            } else {
                INSTANCE.get();
            }
        }
        return instance;
    }
}
