package chapter04.factorymethod;

import chapter04.pizzas.ChicagoStyleCheesePizza;
import chapter04.pizzas.ChicagoStyleClamPizza;
import chapter04.pizzas.ChicagoStylePepperoniPizza;
import chapter04.pizzas.ChicagoStyleVeggiePizza;
import chapter04.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }

}
