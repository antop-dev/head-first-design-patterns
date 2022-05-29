package chapter04.factorymethod;

import chapter04.pizzas.NYStyleCheesePizza;
import chapter04.pizzas.NYStyleClamPizza;
import chapter04.pizzas.NYStylePepperoniPizza;
import chapter04.pizzas.NYStyleVeggiePizza;
import chapter04.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }

}
