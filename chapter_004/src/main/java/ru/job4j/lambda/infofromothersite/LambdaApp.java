package ru.job4j.lambda.infofromothersite;

interface Operation {
    int calculate();
}

public class LambdaApp {
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        Operation op = () -> {
            x = 30;
            return x + y;
        };
        System.out.println(op.calculate()); // 50
        System.out.println(x); // 30 - значение x изменилось
    }
}


