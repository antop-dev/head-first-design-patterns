package chapter07.hometheater;

public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + "이 켜졌습니다.");
    }

    public void off() {
        System.out.println(description + "이 꺼졌습니다.");
    }

    public void dim(int level) {
        System.out.println(description + " 밝기를 " + level + "%로 설정합니다.");
    }

    public String toString() {
        return description;
    }
}
