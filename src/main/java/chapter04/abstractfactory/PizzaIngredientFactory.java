package chapter04.abstractfactory;

import chapter04.abstractfactory.cheese.Cheese;
import chapter04.abstractfactory.clams.Clams;
import chapter04.abstractfactory.dough.Dough;
import chapter04.abstractfactory.pepperoni.Pepperoni;
import chapter04.abstractfactory.sauce.Sauce;
import chapter04.abstractfactory.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
