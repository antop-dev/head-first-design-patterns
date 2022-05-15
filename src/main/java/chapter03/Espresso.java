package chapter03;

/**
 * 에스프레소 구현체
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99; // 에스프레소의 가격만 리턴
    }
}
