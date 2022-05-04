package chapter02.push;

/**
 * 옵저버 인터페이스
 */
public interface Observer {
    /**
     * 기상정보가 변경되었음을 알림
     *
     * @param temp     온도
     * @param humidity 습도
     * @param pressure 기압
     */
    void update(float temp, float humidity, float pressure);
}
