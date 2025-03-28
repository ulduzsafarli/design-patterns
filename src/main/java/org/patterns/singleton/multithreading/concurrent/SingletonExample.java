package org.patterns.singleton.multithreading.concurrent;

import org.patterns.singleton.multithreading.MultithreadingDemo;

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern Demonstrations ===");

        // 5. ConcurrentHashMap Singleton
        Singleton concurrent1 =
                Singleton.getInstance();
        Singleton concurrent2 =
                Singleton.getInstance();
        System.out.println("\n[ConcurrentHashMap Singleton]");
        System.out.println("Instance 1 hash: " + System.identityHashCode(concurrent1));
        System.out.println("Instance 2 hash: " + System.identityHashCode(concurrent2));
        System.out.println("Same instance? " + (concurrent1 == concurrent2));

        // Multithreaded demonstration
        System.out.println("\n=== Testing Thread Safety ===");
        MultithreadingDemo.testThreadSafety(Singleton::getInstance, "ConcurrentHashMap Singleton");
    }
}