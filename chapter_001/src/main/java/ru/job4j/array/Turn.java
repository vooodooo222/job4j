package ru.job4j.array;

/**
 * Turn
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class Turn {
    /**
     * "Разварачивает" массив.
     * Производит обмен значений по начальному (с 0) и конечному (с индекса: размер массива - 1) индексу массива,
     * смещая данные индексы к центру массива после каждой итерации обмена значений.
     * @param array - целочисленный массив
     * @return - результирующий массив после "разворота"
     */
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
