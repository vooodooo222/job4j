package ru.job4j.patterns.manchkin.characters.behaviors;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("axe hit");
    }
}
