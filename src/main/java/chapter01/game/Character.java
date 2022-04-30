package chapter01.game;

abstract public class Character {
    WeaponBehavior weapon;

    protected void fight() {
        weapon.useWeapon();
    }
}
