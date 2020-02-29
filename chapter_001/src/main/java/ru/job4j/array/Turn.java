package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int beginIndex = 0; beginIndex < array.length / 2; beginIndex++) {
            int tmp = array[beginIndex];
            int endIndex = array.length - 1 - beginIndex;
            array[beginIndex] = array[endIndex];
            array[endIndex] = tmp;
        }
        return array;
    }
}
