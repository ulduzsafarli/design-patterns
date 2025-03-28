package org.patterns.singleton.multithreading.DCL;


import org.patterns.singleton.multithreading.MultithreadingDemo;

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern Demonstrations ===");

        // 2. Double-Checked Locking Singleton
        Singleton dcl1 = Singleton.getInstance();
        Singleton dcl2 = Singleton.getInstance();
        System.out.println("\n[Double-Checked Locking Singleton]");
        System.out.println("Instance 1 hash: " + System.identityHashCode(dcl1));
        System.out.println("Instance 2 hash: " + System.identityHashCode(dcl2));
        System.out.println("Same instance? " + (dcl1 == dcl2));


        // Multithreaded demonstration
        System.out.println("\n=== Testing Thread Safety ===");
        MultithreadingDemo.testThreadSafety(Singleton::getInstance, "DCL Singleton");
    }
}