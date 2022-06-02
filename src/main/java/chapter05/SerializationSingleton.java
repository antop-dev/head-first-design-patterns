package chapter05;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {
    public static final SerializationSingleton INSTANCE = new SerializationSingleton();

    private int value;

    private SerializationSingleton() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
