package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        // проверить. что массив word имеет последние элементы одинаковые с post
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
