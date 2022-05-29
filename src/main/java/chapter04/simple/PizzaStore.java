package chapter04.simple;

import chapter04.pizzas.Pizza;

public class PizzaStore {
    private final SimplePizzaFactory factory;

    /**
     * 피자 팩토리 클래스를 주입 받는다.
     *
     * @param factory 피자 객체 생성을 담당하는 팩토리 클래스
     */
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        // 피자 생성을 팩토리 클래스에 위임
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
