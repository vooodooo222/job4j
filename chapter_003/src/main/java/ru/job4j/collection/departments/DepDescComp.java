package ru.job4j.collection.departments;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int index1 = o1.indexOf("/");
        int index2 = o2.indexOf("/");
        String str1 = o1.substring(0, index1 == -1 ? o1.length() : index1);
        String str2 = o2.substring(0, index2 == -1 ? o2.length() : index2);
        int rsl = str2.compareTo(str1);
        if (rsl == 0) {
            rsl = o1.compareTo(o2);
        }
        return rsl;
    }
}
