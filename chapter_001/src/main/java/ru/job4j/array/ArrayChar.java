package ru.job4j.array;

/**
 * ArrayChar
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class ArrayChar {
    /**
     * Проверка, что массив word имеет начальные элементы одинаковые с массивом pref
     * @param word - проверяемое слово
     * @param pref - префикс
     * @return - true в случае упеха, иначе - false
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        if (pref.length <= word.length) {
            result = true;
            for (int index = 0; index < pref.length; index++) {
                if (word[index] != pref[index]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
