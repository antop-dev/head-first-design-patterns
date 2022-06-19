package chapter07.hometheater;

public class Amplifier {
    String description;
    Tuner tuner;
    StreamingPlayer player;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + "가 켜졌습니다.");
    }

    public void off() {
        System.out.println(description + "가 꺼졌습니다.");
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    public void setSurroundSound() {
        System.out.println(description + "를 서라운드 모드로 설정합니다(5.1채널).");
    }

    public void setVolume(int level) {
        System.out.println(description + " 볼륨을 " + level + "로 설정합니다.");
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + player);
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + "를 " + player.description + "와 연결합니다.");
        this.player = player;
    }

    public String toString() {
        return description;
    }
}
