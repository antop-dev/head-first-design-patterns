package chapter03;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CondimentPrettyPrint extends CondimentDecorator {
    private final Beverage beverage;

    public CondimentPrettyPrint(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }

    @Override
    public String getDescription() {
        return Arrays.stream(beverage.getDescription().split(", "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getKey() + ((e.getValue() > 1) ? "x" + e.getValue() : ""))
                .collect(Collectors.joining(", "));
    }
}
