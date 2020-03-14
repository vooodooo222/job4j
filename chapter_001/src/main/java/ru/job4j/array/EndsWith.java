package ru.job4j.array;

/**
 * EndsWith
 * @author Aleksandrov Vladimir (lazer_shtamp@mail.ru)
 */
public class EndsWith {
    /**
     * Проверка, что массив word имеет последние элементы одинаковые с массивом post
     * @param word - проверяемое слово
     * @param post - постфикс
     * @return - true в случае упеха, иначе - false
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        if (post.length > 0 && post.length <= word.length) {
            result = true;
            for (int i = 0; i < post.length; ++i) {
                if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
