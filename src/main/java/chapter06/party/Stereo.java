package chapter06.party;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " 오디오가 켜졌습니다");
    }

    public void off() {
        System.out.println(location + " 오디오가 꺼졌습니다");
    }

    public void setCD() {
        System.out.println(location + " 오디오에서 CD가 재생됩니다");
    }

    public void setDVD() {
        System.out.println(location + " 오디오에서 DVD가 재생됩니다");
    }

    public void setRadio() {
        System.out.println(location + " 오디오에서 라디오가 재생됩니다");
    }

    /**
     * code to set the volume
     *
     * @param volume valid range: 1-11 (after all 11 is better than 10, right?)
     */
    public void setVolume(int volume) {
        System.out.println(location + " 오디오의 볼륨이 " + volume + "로 설정되었습니다");
    }
}
