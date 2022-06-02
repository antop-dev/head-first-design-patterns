package chapter05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SerializationTest {
    public static final String FILE_NAME = "out.ser";

    @Test
    void test() throws Exception {
        SerializationSingleton singleton1 = SerializationSingleton.INSTANCE;
        // 값을 1로 변경
        singleton1.setValue(1);
        // 직렬화
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(singleton1);
        }
        // 값을 2로 변경
        singleton1.setValue(2);
        // 역직렬화
        SerializationSingleton singleton2;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            singleton2 = (SerializationSingleton) in.readObject();
        }

        System.out.println("singleton1.value = " + singleton1.getValue()); // 2
        System.out.println("singleton2.value = " + singleton2.getValue()); // 2? 1?

        assertNotEquals(singleton1, singleton2);
        assertNotEquals(singleton1.getValue(), singleton2.getValue());
    }

    @BeforeEach
    @AfterEach
    void removeTempFile() throws IOException {
        Files.deleteIfExists(Path.of(FILE_NAME));
    }

}
