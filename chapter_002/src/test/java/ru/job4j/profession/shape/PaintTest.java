package ru.job4j.profession.shape;

/**
 * Test.
 * @author Evgenii Shegai (34shegai@gmail.com)
 * @version $Id$
 * @since 0.1
 * @Before - выполняет метод, до запуска теста.
 * @After - выполняет метод, после запуска теста.
 */


import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.After;
import org.junit.Before;

public class PaintTest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                                .append("* * * *")
                                .append("*     *")
                                .append("*     *")
                                .append("* * * *")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append("  *  ")
                .append(" * * ")
                .append("* * *")
                .append(System.lineSeparator())
                .toString()));

    }
}

