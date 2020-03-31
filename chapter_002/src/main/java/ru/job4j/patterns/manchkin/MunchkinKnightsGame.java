package ru.job4j.patterns.manchkin;

import ru.job4j.patterns.manchkin.characters.*;
import ru.job4j.patterns.manchkin.characters.Character;
import ru.job4j.patterns.manchkin.characters.behaviors.BowAndArrowBehavior;

public class MunchkinKnightsGame {
    public static void main(String[] args) {
        Character character = new King();
        character.fight();
        character = new Troll();
        character.fight();
        character = new Knight();
        character.fight();
        character = new Queen();
        character.fight();
        character.setWeapon(new BowAndArrowBehavior());
        character.fight();
    }
}
