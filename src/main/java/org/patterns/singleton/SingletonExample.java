package org.patterns.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern Demonstrations ===");

        // 1. Basic Singleton (Non-thread-safe)
        Singleton basic1 = Singleton.getInstance();
        Singleton basic2 = Singleton.getInstance();
        System.out.println("\n[Basic Singleton]");
        System.out.println("Instance 1 hash: " + System.identityHashCode(basic1));
        System.out.println("Instance 2 hash: " + System.identityHashCode(basic2));
        System.out.println("Same instance? " + (basic1 == basic2));
    }
}