package ru.job4j.collection.departments;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] strArr1 = o1.split("/");
        String[] strArr2 = o2.split("/");
        for (int index = 0; index < Math.min(strArr1.length, strArr2.length); index++) {
            if (index == 0) {
                rsl = strArr2[index].compareTo(strArr1[index]);
                if (rsl != 0) {
                    break;
                }
            } else {
                rsl = strArr1[index].compareTo(strArr2[index]);
                if (rsl != 0) {
                    break;
                }
            }
        }
        return rsl != 0 ? rsl : Integer.compare(strArr1.length, strArr2.length);
    }
}
