package ru.job4j.array;

/**
 * Check
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class Check {
    /**
     * Прверка всех ячеек массива на одинаковые значения
     * @param data - массив булевых значений
     * @return - true если все значения в массиве одинаковые, иначе - false
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
