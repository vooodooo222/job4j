package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int indexFound = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                indexFound = index;
                break;
            }
        }
        return indexFound;
    }

    public int indexOf(int[] data, int el, int startIndex, int finishIndex) {
        int indexFound = -1; // если элемента нет в массиве, то возвращаем -1.
        if (isValid(startIndex, data) && isValid(finishIndex, data)) {
            for (int index = startIndex; index < finishIndex; index++) {
                if (data[index] == el) {
                    indexFound = index;
                    break;
                }
            }
        }
        return indexFound;
    }

    public boolean isValid(int index, int[] data) {
        return (index >= 0 && index < data.length);
    }
}
