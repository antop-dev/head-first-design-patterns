package chapter03;

import java.math.BigDecimal;

/**
 * 휘핑크림 첨가물
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public double cost() {
        return new BigDecimal("" + beverage.cost())
                .add(new BigDecimal(".10"))
                .doubleValue();
    }

}
