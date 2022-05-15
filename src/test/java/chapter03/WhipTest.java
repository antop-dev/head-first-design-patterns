package chapter03;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class WhipTest {

    @Test
    void getDescription() {
        // given
        Beverage beverage = new Whip(new StubBeverage());
        // when
        String description = beverage.getDescription();
        // then
        assertThat(description, is("제목 없음, 휘핑크림"));
    }

    @Test
    void cost() {
        // given
        Beverage beverage = new Whip(new StubBeverage());
        // when
        double cost = beverage.cost();
        // then
        assertThat(cost, is(.10));
    }
}
