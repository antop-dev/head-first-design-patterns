package chapter08;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

class MyStringListTest {

    @Test
    void size() {
        String[] strings = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        MyStringList sut = new MyStringList(strings);

        List<String> subList = sut.subList(1, 3);

        assertThat(subList, hasSize(2));
        assertThat(subList.get(0), is("b"));
        assertThat(subList.get(1), is("c"));
    }

}
