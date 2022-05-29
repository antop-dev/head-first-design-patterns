package chapter04.simple;

import chapter04.pizzas.Pizza;
import org.junit.jupiter.api.Test;

class SimplePizzaFactoryTest {

    @Test
    void createPizza() {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }

}
