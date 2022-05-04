package chapter02.pull;

/**
 * 옵저버 인터페이스
 */
public interface Observer {
    /**
     * 기상정보가 변경되었음을 알림
     */
    void update();
}
