package ru.job4j.collection.departments;

import java.util.*;

public class Departments {
    public static <T> List<String> fillGaps(List<String> deps, Comparator<? super T> c) {
        HashSet<String> tmp = new HashSet<>();
        for (String dep : deps) {
            String start = "";
            for (String el : dep.split("/")) {
                start = start.isEmpty() ? start + el : start + "/" + el;
                tmp.add(start);
            }
        }
        return sort(new ArrayList<>(tmp), (Comparator) c);
    }

    public static <T> List<String> sort(List<String> orgs, Comparator<? super T> c) {
        orgs.sort((Comparator) c);
        return orgs;
    }
}
