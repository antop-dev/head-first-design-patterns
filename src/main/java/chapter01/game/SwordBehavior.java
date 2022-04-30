package chapter01.game;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() { // 검을 휘두르는 행동을 구현
        System.out.println("검을 휘두른다");
    }
}
