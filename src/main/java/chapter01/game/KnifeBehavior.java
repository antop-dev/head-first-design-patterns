package chapter01.game;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() { // 칼로 베는 행동을 구현
        System.out.println("칼로 벤다");
    }
}
