package chapter03;

import java.math.BigDecimal;

/**
 * 모카 첨가물
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        return new BigDecimal("" + beverage.cost())
                .add(new BigDecimal(".20"))
                .doubleValue();
    }

}
