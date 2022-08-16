package chapter14.bridge;

public class SpecialRemote extends RemoteControl {
    public SpecialRemote(Tv tv) {
        super(tv);
    }

    public void up() {
        int channel = this.getChannel();
        this.setChannel(channel + 1);
    }

    public void down() {
        int channel = this.getChannel();
        this.setChannel(channel - 1);
    }
}
