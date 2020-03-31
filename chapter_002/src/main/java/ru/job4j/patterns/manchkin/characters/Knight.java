package ru.job4j.patterns.manchkin.characters;

import ru.job4j.patterns.manchkin.characters.behaviors.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Knight fight!");
        performWeapon();
    }
}
