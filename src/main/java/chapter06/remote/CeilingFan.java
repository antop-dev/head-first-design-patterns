package chapter06.remote;

public class CeilingFan {
    String location;
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    /**
     * turns the ceiling fan on to high
     */
    public void high() {
        level = HIGH;
        System.out.println(location + " 선풍기 속도가 HIGH로 설정되었습니다");

    }

    /**
     * turns the ceiling fan on to medium
     */
    public void medium() {
        level = MEDIUM;
        System.out.println(location + " 선풍기 속도가 MEDIUM으로 설정되었습니다");
    }

    /**
     * turns the ceiling fan on to low
     */
    public void low() {
        level = LOW;
        System.out.println(location + " 선풍기 속도가 LOW로 설정되었습니다");
    }

    /**
     * turns the ceiling fan off
     */
    public void off() {
        level = 0;
        System.out.println(location + " 선풍기가 꺼졌습니다");
    }

    public int getSpeed() {
        return level;
    }
}
