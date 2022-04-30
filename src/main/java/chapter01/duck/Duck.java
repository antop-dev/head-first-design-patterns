package chapter01.duck;

abstract public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void performQuack() {
        quackBehavior.quack(); // 행동 클래스에 위임
    }

    public void performFly() {
        flyBehavior.fly(); // 행동 클래스에 위임
    }

    abstract protected void display();

    protected void swim() {
        System.out.println("모든 오르는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    // 세터를 이용하여 언제든지 오리의 행동을 즉석에서 바꿀 수 있다.
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
