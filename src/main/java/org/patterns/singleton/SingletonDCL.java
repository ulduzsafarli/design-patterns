package org.patterns.singleton;

//Double-Checked Locking (DCL) Implementation
public class SingletonDCL {
    private static volatile SingletonDCL instance;

    private SingletonDCL() {}

    public static SingletonDCL getInstance() {
        if (instance == null) {  // First check (no synchronization)
            synchronized (SingletonDCL.class) {  // Synchronize
                if (instance == null) {  // Second check (inside synchronized)
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}