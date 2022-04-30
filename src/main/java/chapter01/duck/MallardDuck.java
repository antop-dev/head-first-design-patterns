package chapter01.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    protected void display() {
        System.out.println("저는 물오리입니다");
    }
}
