package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int lastIndex = data.length - 1;
        for (int beginIndex = 0; beginIndex < data.length; beginIndex++) {
            int min = MinDiapason.findMin(data, beginIndex, lastIndex);
            FindLoop findLoop = new FindLoop();
            int foundIndex = findLoop.indexOf(data, min, beginIndex, lastIndex);
            swap(data, beginIndex, foundIndex);
        }
        return data;
    }

    public static void swap(int[] data, int firstIndex, int secondIndex) {
        int tmp = data[firstIndex];
        data[firstIndex] = data[secondIndex];
        data[secondIndex] = tmp;
    }
}
