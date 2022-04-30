package chapter01.duck;

import org.junit.jupiter.api.Test;

class MallardDuckTest {

    @Test
    void behavior() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        // 세터 메소드를 이용하여 행동 변경
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }

}
