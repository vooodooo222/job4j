package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0) {
            rsl = right.clone();
        } else if (right.length == 0) {
            rsl = left.clone();
        } else {
            SortedQueue leftSortedQueue = new SortedQueue(left);
            SortedQueue rightSortedQueue = new SortedQueue(right);
            SortedQueue master = leftSortedQueue;
            SortedQueue slave = rightSortedQueue;
            SortedQueue result = new SortedQueue(rsl);
            int parityCounter = 0;
            for (int rslIndex = 0; rslIndex < rsl.length; rslIndex++) {
                parityCounter += this.fillValueFromSlaveUntilMasterCellLargest(master, slave, result);
                if (parityCounter % 2 != 0) {
                    master = rightSortedQueue;
                    slave = leftSortedQueue;
                } else {
                    master = leftSortedQueue;
                    slave = rightSortedQueue;
                }
            }
            result.setArray(rsl);
        }
        return rsl;
    }

    protected int fillValueFromSlaveUntilMasterCellLargest(SortedQueue master, SortedQueue slave, SortedQueue result) {
        boolean isCurrentArrayCellLargest = true;
        while (isCurrentArrayCellLargest) {
            if (!master.empty() && !slave.empty()) {
                if (master.viewValue() == slave.viewValue()) {
                    result.write(slave.pushOutValue());
                    result.write(master.pushOutValue());
                } else if (master.viewValue() < slave.viewValue()) {
                    result.write(master.pushOutValue());
                    isCurrentArrayCellLargest = false;
                } else {
                    result.write(slave.pushOutValue());
                }
            } else if (!master.empty()) {
                result.write(master.pushOutValue());
            } else if (!slave.empty()) {
                result.write(slave.pushOutValue());
            } else {
                break;  // все данные слиты
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
