package chapter02.push;

public interface Subject {
    /**
     * 옵저버를 등록
     *
     * @param observer 옵저버 인터페이스
     */
    void registerObserver(Observer observer);

    /**
     * 옵저버를 삭제
     *
     * @param observer 옵저버 인터페이스
     */
    void removeObserver(Observer observer);

    /**
     * 주제의 상태가 변경되었을 때 모든 옵저버에게 변경 내용을 알리려고 호출 되는 메소드
     */
    void notifyObservers();
}
