package chapter14.bridge;

public abstract class Tv {
    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel(int channel);

    public abstract int getChannel();
}
