package chapter11.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private final Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException, InvocationTargetException {
        if (method.getName().startsWith("set") && !method.getName().equals("setGeekRating")) {
            throw new IllegalAccessException();
        }
        return method.invoke(person, args);
    }
}
