package ru.job4j.lambda.inforfombooks;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        print(animals, new CheckIfHopper());                    // pass class that does check
        CheckTrait checkTrait = new CheckIfHopper() {
            @Override
            public boolean test(Animal a) {
                return super.test(a);
            }
        };
        print(animals, checkTrait);                             // through anonymous class
        print(animals, (Animal a) -> {
            return a.canHop();
        });                                                     // through lambda
        print(animals, a -> a.canHop());                        // through shortcut lambda
        print(animals, Animal::canHop);                         // through shortcut lambda
        print(animals, a -> a.canSwim());
        print(animals, a -> !a.canSwim());
    }
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) { // the general check
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
