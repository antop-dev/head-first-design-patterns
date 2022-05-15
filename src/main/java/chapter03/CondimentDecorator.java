package chapter03;

/**
 * 첨가물 추상 클래스<br>
 * Beverage 타입를 맞춘다.
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 이 데코레이터가 감쌀 음료 객체
     */
    Beverage beverage;

    /**
     * 모든 첨가물 테코레이터에서 이 메소드를 새로 구현하도록 만들 계획
     *
     * @return 음료 설명
     */
    public abstract String getDescription();
}
