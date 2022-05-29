package chapter04.factorymethod;

import chapter04.pizzas.Pizza;
import org.junit.jupiter.api.Test;

public class OrderTest {

    @Test
    void order() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza1.getName() + "\n");

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza2.getName() + "\n");
    }
}
