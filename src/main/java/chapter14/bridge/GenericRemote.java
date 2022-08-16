package chapter14.bridge;

public class GenericRemote extends RemoteControl {
    public GenericRemote(Tv tv) {
        super(tv);
    }

    public void nextChannel() {
        int channel = this.getChannel();
        this.setChannel(channel + 1);
    }

    public void prevChannel() {
        int channel = this.getChannel();
        this.setChannel(channel - 1);
    }
}
