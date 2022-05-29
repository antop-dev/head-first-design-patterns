package chapter04.abstractfactory;


import org.junit.jupiter.api.Test;

public class OrderTest {

    @Test
    void order() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza1.getName() + "\n");
        System.out.println(pizza1);

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza2.getName() + "\n");
        System.out.println(pizza2);
    }
}
