package org.patterns.singleton.multithreading.instanceHolder;

import org.patterns.singleton.multithreading.MultithreadingDemo;

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern Demonstrations ===");


        // 3. Holder Pattern Singleton
        Singleton holder1 = Singleton.getInstance();
        Singleton holder2 = Singleton.getInstance();
        System.out.println("\n[Holder Pattern Singleton]");
        System.out.println("Instance 1 hash: " + System.identityHashCode(holder1));
        System.out.println("Instance 2 hash: " + System.identityHashCode(holder2));
        System.out.println("Same instance? " + (holder1 == holder2));

        // Multithreaded demonstration
        System.out.println("\n=== Testing Thread Safety ===");
        MultithreadingDemo.testThreadSafety(Singleton::getInstance, "Holder Singleton");
    }
}