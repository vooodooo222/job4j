package ru.job4j.collection.departments;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String dep : deps) {
            String start = "";
            for (String el : dep.split("/")) {
                start = start.isEmpty() ? start + el : start + "/" + el;
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static List<String> sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
        return orgs;
    }

    public static List<String> sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
        return orgs;
    }
}
