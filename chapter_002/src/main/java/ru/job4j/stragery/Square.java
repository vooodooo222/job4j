package ru.job4j.stragery;

import java.util.StringJoiner;

public class Square implements Shape {
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("++++");
        pic.add("+  +");
        pic.add("+  +");
        pic.add("++++");
        return pic.toString();
    }
}
