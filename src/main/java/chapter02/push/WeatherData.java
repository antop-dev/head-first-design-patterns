package chapter02.push;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    /**
     * 옵저버들
     */
    private final List<Observer> observers;
    /**
     * 온도
     */
    private float temperature;
    /**
     * 습도
     */
    private float humidity;
    /**
     * 기압
     */
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /**
     * 옵저버 등록
     *
     * @param observer 옵저버 인터페이스
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 옵저버 탈퇴
     *
     * @param observer 옵저버 인터페이스
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 모든 옵저버에게 상태 변화를 알려준다
     */
    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    /**
     * 가상 스테이션으로부터 갱신된 측정값을 받으면 옵저버들에게 알린다
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 가상 스테이션에서 이 메소드를 이용해서 기상 데이터를 가져오는 것으로 한다.
     *
     * @param temperature 온도
     * @param humidity    습도
     * @param pressure    기압
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
