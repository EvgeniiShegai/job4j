package ru.job4j.calculate.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PaintTest {

    @Test
    public void whenPyramid2() {
        Paint paint = new Paint();
        String rst = paint.piramid(2);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(" ^ ")
                .add("^^^")
                .toString()
        ));
    }


    @Test
    public void whenPyramid3() {
        Paint paint = new Paint();
        String rst = paint.piramid(3);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("  ^  ")
                .add(" ^^^ ")
                .add("^^^^^")
                .toString()
        ));
    }
}