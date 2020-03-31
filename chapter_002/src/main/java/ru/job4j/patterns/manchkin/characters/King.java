package ru.job4j.patterns.manchkin.characters;

import ru.job4j.patterns.manchkin.characters.behaviors.SwordBehavior;

public class King extends Character {

    public King() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("King fight!");
        performWeapon();
    }
}
