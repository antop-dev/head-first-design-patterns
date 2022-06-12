package chapter06.party;

public class TV {
    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV가 켜졌습니다");
    }

    public void off() {
        System.out.println(location + " TV가 꺼졌습니다");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println(location + " TV에서 DVD를 재생합니다");
    }
}
