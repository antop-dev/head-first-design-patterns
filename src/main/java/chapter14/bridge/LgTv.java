package chapter14.bridge;

public class LgTv extends Tv {
    int channel = 1;

    public void on() {
        System.out.println("Turning on the LG TV");
    }

    public void off() {
        System.out.println("Turning off the LG TV");
    }

    public void tuneChannel(int channel) {
        this.channel = channel;
        System.out.println("Set the LG TV Channel to " + this.channel);
    }

    public int getChannel() {
        return channel;
    }
}
