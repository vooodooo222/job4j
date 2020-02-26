package ru.job4j.condition;

// В методе нужно использовать несколько раз тернарный оператор условия.

public class MultiMax {
    public int max(int first, int second, int third) {
        //int result = Max.max(Max.max(first, second), Max.max(second, third));
        int result1 = first > second? first : second;
        int result2 = second > third? second : third;
        int result = result1 > result2? result1 : result2;
        return result;
    }
}
