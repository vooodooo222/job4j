package ru.job4j.patterns.manchkin.characters;

import ru.job4j.patterns.manchkin.characters.behaviors.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Troll fight!");
        performWeapon();
    }
}
