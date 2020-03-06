package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-2);
    }

    public static void possibleDiv(int number) {
        String msg;
        if (number == 0) {
            msg = "Could not div by ";
        }
        else if (number < 0) {
            msg = "This is negative number ";
        }
        else {
            msg = "This is div by ";
        }
        System.out.println(msg + number);
    }
}
