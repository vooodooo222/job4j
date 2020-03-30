package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PaintTest {
    @Test
    public void whenDrawTriangle() {
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в память для тестирования
        // (в new PrintStream(out) используется up casting: ByteArrayOutputStream to OutputStream).
        System.setOut(new PrintStream(out));
        // выполняем действия пишущее в консоль.
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                    new StringJoiner(System.lineSeparator())
                            .add("++++")
                            .add("+  +")
                            .add("+  +")
                            .add("++++")
                            .add("")
                            .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }

    @Test
    public void whenDrawSquare() {
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в память для тестирования
        // (в new PrintStream(out) используется up casting: ByteArrayOutputStream to OutputStream).
        System.setOut(new PrintStream(out));
        // выполняем действия пишущее в консоль (в буфер для хранения вывода).
        new Paint().draw(new Triangle());
        assertThat(
                // создаем новую строку с данными из буфера для хранения вывода
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                        .add("    +    ")
                        .add("   + +   ")
                        .add("  +   +  ")
                        .add(" +     + ")
                        .add("+++++++++")
                        .add("")
                        .toString()
                )
        );
    }
}