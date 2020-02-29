package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        // проверить. что массив word имеет последние элементы одинаковые с post
        boolean result = false;
        if (post.length != 0 && word.length != 0 && post.length <= word.length) {
            result = true;
            int wordIndex = word.length - 1;
            int postIndex = post.length - 1;
            for (; postIndex >= 0; --postIndex, --wordIndex) {
                if (word[wordIndex] != post[postIndex]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
