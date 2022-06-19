package chapter07.hometheater;

public class Projector {
    String description;
    StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {
        System.out.println(description + "가 켜졌습니다.");
    }

    public void off() {
        System.out.println(description + "가 꺼졌습니다.");
    }

    public void wideScreenMode() {
        System.out.println(description + " 화면 비율을 와이드 모드로 설정합니다(16:9 비율).");
    }

    public void tvMode() {
        System.out.println(description + " in tv mode (4x3 aspect ratio)");
    }

    public String toString() {
        return description;
    }
}
