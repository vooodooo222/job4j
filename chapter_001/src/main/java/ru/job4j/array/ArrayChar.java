package ru.job4j.array;

public class ArrayChar {
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
