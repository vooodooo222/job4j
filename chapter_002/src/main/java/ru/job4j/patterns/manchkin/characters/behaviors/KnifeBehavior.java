package ru.job4j.patterns.manchkin.characters.behaviors;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("knife hit");
    }
}
