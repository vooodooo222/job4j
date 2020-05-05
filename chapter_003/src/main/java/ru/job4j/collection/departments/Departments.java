package ru.job4j.collection.departments;

import java.util.*;

public class Departments {
    public static boolean checkPerformance = false;

    public static List<String> fillGapsByHashSet(List<String> deps, Comparator<? super String> c) {
        long startTime = 0;
        if (checkPerformance) {
            startTime = System.nanoTime();
        }
        HashSet<String> tmp = new HashSet<>();
        for (String dep : deps) {
            String start = "";
            for (String el : dep.split("/")) {
                start = start.isEmpty() ? start + el : start + "/" + el;
                tmp.add(start);
            }
        }
        List<String> list = new ArrayList<>(tmp);
        list.sort(c);
        if (checkPerformance) {
            long stopTime = System.nanoTime();
            long microsecondsElapsedTime = (stopTime - startTime) / 1000;
            System.out.println("HashSet with comparator:" + c.getClass() + " : " + microsecondsElapsedTime);
        }
        return list;
    }

    public static List<String> fillGapsByTreeSet(List<String> deps, Comparator<? super String> c) {
        long startTime = 0;
        if (checkPerformance) {
            startTime = System.nanoTime();
        }
        TreeSet<String> tmp = new TreeSet<>(c);
        for (String dep : deps) {
            String start = "";
            for (String el : dep.split("/")) {
                start = start.isEmpty() ? start + el : start + "/" + el;
                tmp.add(start);
            }
        }
        List<String> list = new ArrayList<>(tmp);
        if (checkPerformance) {
            long stopTime = System.nanoTime();
            long microsecondsElapsedTime = (stopTime - startTime) / 1000;
            System.out.println("TreeSet with comparator : " + c.getClass() + " : " + microsecondsElapsedTime);
        }
        return list;
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
