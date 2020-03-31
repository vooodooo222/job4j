package ru.job4j.patterns.manchkin.characters.behaviors;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("archery");
    }
}
