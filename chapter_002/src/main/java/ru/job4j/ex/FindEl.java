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
            // Если мы оставим блок catch только c Exception, то мы будем захватывать RuntimeException тоже, а это не желательно.
            // В таком случае:
            // При ElementAbuseException - ситуация остаеться под контролем
            // При RuntimeException - приложение будет продолжат успешно работать (это не правильно!)
            // RuntimeException должны использоваться в основном в ручном и автоматическом тестировании,
            // но не в обработке во время выполнения рабочего кода (не во время runtime)
//        } catch (RuntimeException en) {
//            // а так можно вычленить все RuntimeException отдельно от всех Exception
//            // но делать так не стоит в рабочем коде, только в тестах и при ручном тестировании
        } catch (Exception e) {
            e.printStackTrace();
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
