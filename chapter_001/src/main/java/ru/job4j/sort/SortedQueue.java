package ru.job4j.sort;


class SortedQueue {
    static class CurrentReadCell {
        protected int index = 0;
    }

    static class CurrentWriteCell {
        protected int index = 0;
    }

    public int length;

    protected int[] array;
    protected CurrentReadCell currentReadCell = new CurrentReadCell();
    protected CurrentWriteCell currentWriteCell = new CurrentWriteCell();

    SortedQueue(int[] array) {
        //this.array = array;     //can use clone memory
        this.array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
        this.length = array.length;
    }

    public int viewValue() {
        return array[currentReadCell.index];
    }

    public int pushOutValue() {
        int value = this.viewValue();
        this.pop();
        return value;
    }

    public void write(int value) {
        array[currentWriteCell.index] = value;
        this.setNextWriteIndexValue();
    }

    public void setArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = this.array[i];
        }
    }

    public boolean empty() {
        return currentReadCell.index >= array.length;
    }

    protected void setNextReadIndexValue() {
        currentReadCell.index++;
    }

    protected void setNextWriteIndexValue() {
        currentWriteCell.index++;
    }

    protected void pop() {
        this.setNextReadIndexValue();
    }

}
