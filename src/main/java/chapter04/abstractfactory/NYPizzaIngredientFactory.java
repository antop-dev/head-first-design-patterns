package chapter04.abstractfactory;

import chapter04.abstractfactory.cheese.Cheese;
import chapter04.abstractfactory.cheese.ReggianoCheese;
import chapter04.abstractfactory.clams.Clams;
import chapter04.abstractfactory.clams.FreshClams;
import chapter04.abstractfactory.dough.Dough;
import chapter04.abstractfactory.dough.ThinCrustDough;
import chapter04.abstractfactory.pepperoni.Pepperoni;
import chapter04.abstractfactory.pepperoni.SlicedPepperoni;
import chapter04.abstractfactory.sauce.MarinaraSauce;
import chapter04.abstractfactory.sauce.Sauce;
import chapter04.abstractfactory.veggies.Garlic;
import chapter04.abstractfactory.veggies.Mushroom;
import chapter04.abstractfactory.veggies.Onion;
import chapter04.abstractfactory.veggies.RedPepper;
import chapter04.abstractfactory.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }

}
