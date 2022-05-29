package chapter04.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        Pizza pizza;
        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("시카고 스타일 치즈 피자");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("시카고 스타일 야채 피자");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("시카고 스타일 조개 피자");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("시카고 스타일 페퍼로니 피자");
            }
            default -> pizza = null;
        }
        return pizza;
    }
}
