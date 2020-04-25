package ru.job4j.collection.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        List<Integer> leftList = getListFirstDigitsByDots(left);
        List<Integer> rightList = getListFirstDigitsByDots(right);
        for (int index = 0; index < Math.min(leftList.size(), rightList.size()); index++) {
            rsl = leftList.get(index).compareTo(rightList.get(index));
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0) {
            int compareBySizeList = Integer.compare(leftList.size(), rightList.size());
            rsl = compareBySizeList == 0 ? left.compareTo(right) : compareBySizeList;
        }
        return rsl;
    }

    private List<Integer> getListFirstDigitsByDots(String string) {
        List<Integer> list = new ArrayList<>();
        int beginIndex = 0;
        int endIndex;
        do {
            endIndex = string.indexOf('.', beginIndex);
            if (endIndex < 0) {
                break;
            }
            String str = string.substring(beginIndex, endIndex);
            if (!str.chars().allMatch(Character::isDigit)) {
                break;
            }
            list.add(Integer.valueOf(str));
            beginIndex = endIndex + 1;
        } while (true);
        return list;
    }
}
