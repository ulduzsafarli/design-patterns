package org.patterns.singleton.multithreading.DCL;

//Double-Checked Locking (DCL) Implementation
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {  // First check (no synchronization)
            synchronized (Singleton.class) {  // Synchronize
                if (instance == null) {  // Second check (inside synchronized)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}