package org.patterns.singleton.multithreading.atomic;

import org.patterns.singleton.multithreading.MultithreadingDemo;

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern Demonstrations ===");

        // 4. Atomic Reference Singleton
        Singleton atomic1 = Singleton.getInstance();
        Singleton atomic2 = Singleton.getInstance();
        System.out.println("\n[Atomic Reference Singleton]");
        System.out.println("Instance 1 hash: " + System.identityHashCode(atomic1));
        System.out.println("Instance 2 hash: " + System.identityHashCode(atomic2));
        System.out.println("Same instance? " + (atomic1 == atomic2));


        // Multithreaded demonstration
        System.out.println("\n=== Testing Thread Safety ===");
        MultithreadingDemo.testThreadSafety(Singleton::getInstance, "Atomic Singleton");
    }
}