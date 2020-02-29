package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int[] swapArray = array.clone();    // входной массив не трогаем
        boolean isIndexesValid = source >= 0 && dest >= 0 && source < array.length && dest < array.length;
        if (isIndexesValid) {
            swapArray[source] = array[dest];
            swapArray[dest] = array[source];
        }
        return swapArray;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
