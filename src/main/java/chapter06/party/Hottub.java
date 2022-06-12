package chapter06.party;

public class Hottub {
    boolean on;
    int temperature;

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void circulate() {
        if (on) {
            System.out.println("욕조가 부글부글 끓고 있습니다!");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("욕조가 켜져 있습니다");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("욕조가 꺼져 있습니다");
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("욕조 온도를 " + temperature + "도로 설정합니다");
    }
}
