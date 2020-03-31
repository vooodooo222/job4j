package ru.job4j.patterns.manchkin.characters;

import ru.job4j.patterns.manchkin.characters.behaviors.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Queen fight!");
        performWeapon();
    }
}
