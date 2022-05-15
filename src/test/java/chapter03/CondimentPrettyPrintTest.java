package chapter03;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class CondimentPrettyPrintTest {

    @Test
    void getDescription() {
        Beverage beverage = new CondimentPrettyPrint(new Whip(new Mocha(new Mocha(new DarkRoast()))));
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        MatcherAssert.assertThat(beverage.getDescription(), Matchers.is("다크 로스트 커피, 휘핑크림, 모카x2"));
    }
}
