package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("element not found");
        }
        return rsl;
    }
    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String abuse : abuses) {
            if (abuse.equals(value)) {
                throw new ElementAbuseException("element is abuse");
            }
        }
        // sent(value);
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                //throw new RuntimeException("RuntimeException!!!");
                sent(key, abuses);
            }
        //} catch (Exception e) {
            // Если мы оставим блок catch c Exception, то мы будем захватывать RuntimeException тоже, а это не желательно.
            // В таком случае:
            // При ElementAbuseException - ситуация остаеться под контролем
            // При RuntimeException - приложение будет продолжат успешно работать (это не правильно!)
            //e.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] array = {"1", "2", "$%!&"};
        String[] abuses = {"$%", "$%!&", "!&"};
        String key = "$%!&";
        FindEl.process(array, key, abuses); // ElementAbuseException
        key = "3";
        FindEl.process(array, key, abuses); // ElementNotFoundException
    }
}
