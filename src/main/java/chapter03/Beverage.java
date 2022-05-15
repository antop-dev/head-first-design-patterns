package chapter03;

/**
 * 음료
 */
public abstract class Beverage {
    /**
     * 설명
     */
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    /**
     * 음료 가격
     */
    public abstract double cost();

}
