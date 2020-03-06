package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nextIndex = index + 1;
                while (nextIndex < array.length) {
                    if (array[nextIndex] != null) {
                        // меняем местами null с не null
                        String nullCell = array[index];
                        array[index] = array[nextIndex];
                        array[nextIndex] = nullCell;
                        break;
                    }
                    nextIndex++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
