package chapter14.bridge;

public abstract class RemoteControl {
    private final Tv tv;

    protected RemoteControl(Tv tv) {
        this.tv = tv;
    }

    public void on() {
        this.tv.on();
    }

    public void off() {
        this.tv.off();
    }

    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }

    public int getChannel() {
        return tv.getChannel();
    }

}
