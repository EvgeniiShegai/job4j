package ru.job4j.calculate.loop;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Evgenii Shegai (34shegay@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class BoardTest {

    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(String.format("x x%s x %sx x%s", ln, ln, ln)));
    }

    @Test
    public void when4x5() {
        Board board = new Board();
        String rsl = board.paint(5, 4);
        String ln = System.lineSeparator();
        assertThat(rsl, is(String.format("x x x%s x x %sx x x%s x x %s", ln, ln, ln, ln)));
    }

}