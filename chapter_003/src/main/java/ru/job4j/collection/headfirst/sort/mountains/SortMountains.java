package ru.job4j.collection.headfirst.sort.mountains;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;

public class SortMountains {
    LinkedList<Mountain> mountains = new LinkedList<>();

    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return Integer.compare(two.getHeight(), one.getHeight());
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        mountains.add(new Mountain("Лонг-Рейндж", 14255));
        mountains.add(new Mountain("Эльберт", 14433));
        mountains.add(new Mountain("Марун", 14156));
        mountains.add(new Mountain("Касл", 14265));
        System.out.println("В порядке добавления:\n" + mountains);
        NameCompare nc = new NameCompare();
        Collections.sort(mountains, nc);
        System.out.println("По названию: \n" + mountains);
        HeightCompare he = new HeightCompare();
        Collections.sort(mountains, he);
        System.out.println("По высоте:\n" + mountains);
    }
}