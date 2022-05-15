package chapter03;

import java.math.BigDecimal;

/**
 * 우유 첨가물
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }

    @Override
    public double cost() {
        return new BigDecimal(String.valueOf(beverage.cost()))
                .add(new BigDecimal(".10"))
                .doubleValue();
    }

}
