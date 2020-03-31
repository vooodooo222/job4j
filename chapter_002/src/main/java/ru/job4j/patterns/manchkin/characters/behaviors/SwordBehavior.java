package ru.job4j.patterns.manchkin.characters.behaviors;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("sword hit");
    }
}
