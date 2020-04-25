package ru.job4j.collection.sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        for (int index = 0; index < Math.min(left.length(), right.length()); index++) {
            rsl = Character.compare(left.charAt(index), right.charAt(index));
            if (rsl != 0) {
                break;
            }
        }
        return rsl == 0 ? Integer.compare(left.length(), right.length()) : rsl;
    }
}
