package chapter11.javaproxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @Test
    void owner() {
        Person kim = kim();

        Person proxy = ownerProxy(kim);
        proxy.setInterests("볼링, 바둑");

        assertThat(proxy.getName(), is("김자바"));
        assertThat(proxy.getInterests(), is("볼링, 바둑"));
        assertThrows(Exception.class, () -> proxy.setGeekRating(10)); // IllegalAccessException 예외가 아니다
        assertThat(proxy.getGeekRating(), is(7));
    }

    @Test
    void nonOwner() {
        Person kim = kim();
        Person proxy = nonOwnerProxy(kim);

        assertThrows(Exception.class, () -> proxy.setInterests("볼링, 바둑"));

        proxy.setGeekRating(3);
        assertThat(proxy.getGeekRating(), is(5));
    }

    private Person kim() {
        Person kim = new PersonImpl();
        kim.setName("김자바");
        kim.setInterests("자동차, 컴퓨터, 음악");
        kim.setGeekRating(7);
        return kim;
    }

    private Person ownerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    private Person nonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }

}
