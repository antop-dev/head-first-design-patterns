package chapter03;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StarbuzzCoffeeTest {

    @Test
    void test1() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        assertThat(beverage.cost(), is(1.99)); // 1.99
    }

    @Test
    void test2() {
        Beverage beverage = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        assertThat(beverage.cost(), is(1.49)); // 0.99 + 0.20 + 0.20 + 0.10 = 2.49
    }

    @Test
    void test3() {
        Beverage beverage = new Whip(new Mocha(new Soy(new HouseBlend())));
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        assertThat(beverage.cost(), is(1.34)); // 0.89 + 0.15 + 0.20 + 0.10 = 1.34
    }

    @Test
    void test4() {
        Beverage beverage = new Milk(new Decaf());
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        assertThat(beverage.cost(), is(1.15)); // 1.05 + 0.1 = 1.15
    }

}
