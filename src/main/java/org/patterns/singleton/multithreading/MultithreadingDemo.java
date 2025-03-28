package org.patterns.singleton.multithreading;

import java.util.*;
import java.util.function.Supplier;

public class MultithreadingDemo {
    public static <T> void testThreadSafety(Supplier<T> supplier, String name) {
        System.out.println("\nTesting: " + name);

        Set<Integer> instanceHashes = Collections.synchronizedSet(new HashSet<>());
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            Thread t = new Thread(() -> {
                T instance = supplier.get();
                instanceHashes.add(System.identityHashCode(instance));
            });
            threads.add(t);
        }

        threads.forEach(Thread::start);
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Unique instances created: " + instanceHashes.size());
        if (instanceHashes.size() == 1) {
            System.out.println("+ Thread-safe implementation");
        } else {
            System.out.println("- Potential thread-safety issues");
        }
    }
}
