package singleton;

import org.junit.jupiter.api.Test;
import org.patterns.singleton.Singleton;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonTest {
    @Test
    void testSingletonInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertSame(singleton1,singleton2);
    }
}
