package chapter04.factorymethod;

import chapter04.pizzas.Pizza;

// 추상 클래스
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        // 팩토리 객체가 아닌 createPizza 메소드를 호출한다.
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // 팩토리 메소드(factory method)가 PizzaStore 의 추상 메소드로 바뀌었다.
    protected abstract Pizza createPizza(String type);

}
