package ru.job4j.patterns.manchkin.characters;

import ru.job4j.patterns.manchkin.characters.behaviors.WeaponBehavior;

public abstract class Character {

    /**
     * Алгоритм поведения оружия
     */
    WeaponBehavior weapon;

    public void performWeapon() {
        this.weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }

    public abstract void fight();
}
