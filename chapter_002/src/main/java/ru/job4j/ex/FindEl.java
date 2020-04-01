package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] array = {"1", "2", "3"};
            FindEl.indexOf(array, "4");
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
