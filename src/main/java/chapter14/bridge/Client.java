package chapter14.bridge;

public class Client {
    public static void main(String[] args) {
        SpecialRemote remoteSony = new SpecialRemote(new SonyTv());
        System.out.println("Connect your remote to the TV");
        remoteSony.on();
        remoteSony.up();
        remoteSony.down();
        remoteSony.off();

        GenericRemote remoteLG = new GenericRemote(new LgTv());
        System.out.println("Connect your remote to the TV");
        remoteLG.on();
        remoteLG.nextChannel();
        remoteLG.prevChannel();
        remoteLG.off();
    }
}
