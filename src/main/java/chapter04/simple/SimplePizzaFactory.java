package chapter04.simple;

import chapter04.pizzas.CheesePizza;
import chapter04.pizzas.ClamPizza;
import chapter04.pizzas.PepperoniPizza;
import chapter04.pizzas.Pizza;
import chapter04.pizzas.VeggiePizza;

/**
 * 피자 객체 생성 부분을 전담할 팩토리 클래스
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}
