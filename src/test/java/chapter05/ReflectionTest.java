package chapter05;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ReflectionTest {

    @Test
    void test() throws Exception {
        Singleton singleton1 = Singleton.getInstance();

        Constructor<? extends Singleton> constructor = singleton1.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton singleton2 = constructor.newInstance();

        System.out.println(singleton1); // Singleton@58fdd99
        System.out.println(singleton2); // Singleton@6b1274d2

        assertNotEquals(singleton1, singleton2);
    }
}
