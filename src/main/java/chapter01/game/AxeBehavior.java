package chapter01.game;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() { // 도끼로 찍는 행동을 구현
        System.out.println("도끼로 찍는다");
    }
}
