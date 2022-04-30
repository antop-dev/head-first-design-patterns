package chapter01.game;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() { // 화살을 쏘는 행동을 구현
        System.out.println("화살을 쏜다");
    }
}
