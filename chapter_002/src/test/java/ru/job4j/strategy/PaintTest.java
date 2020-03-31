package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PaintTest {
    /**
     * Поле содержит дефолтный вывод в консоль.
     */
    PrintStream stdout = System.out;

    /**
     * Буфер для результата.
     */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Загрузить вывод в буфер для результата.
     */
    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    /**
     * Загрузить дефолтный вывод в консоль.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenDrawTriangle() {
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
    }

    @Test
    public void whenDrawSquare() {
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