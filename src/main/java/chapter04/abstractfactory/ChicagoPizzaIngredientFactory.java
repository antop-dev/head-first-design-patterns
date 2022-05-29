package chapter04.abstractfactory;

import chapter04.abstractfactory.cheese.Cheese;
import chapter04.abstractfactory.cheese.MozzarellaCheese;
import chapter04.abstractfactory.clams.Clams;
import chapter04.abstractfactory.clams.FrozenClams;
import chapter04.abstractfactory.dough.Dough;
import chapter04.abstractfactory.dough.ThickCrustDough;
import chapter04.abstractfactory.pepperoni.Pepperoni;
import chapter04.abstractfactory.pepperoni.SlicedPepperoni;
import chapter04.abstractfactory.sauce.PlumTomatoSauce;
import chapter04.abstractfactory.sauce.Sauce;
import chapter04.abstractfactory.veggies.BlackOlives;
import chapter04.abstractfactory.veggies.Eggplant;
import chapter04.abstractfactory.veggies.Spinach;
import chapter04.abstractfactory.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
