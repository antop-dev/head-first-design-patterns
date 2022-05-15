package chapter03;

import java.math.BigDecimal;

/**
 * 두유 첨가물
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return new BigDecimal("" + beverage.cost())
                .add(new BigDecimal(".15"))
                .doubleValue();
    }
    
}
