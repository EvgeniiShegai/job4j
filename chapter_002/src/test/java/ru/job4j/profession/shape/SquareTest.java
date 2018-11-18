package ru.job4j.profession.shape;

/**
 * Test.
 * @author Evgenii Shegai (34shegai@gmail.com)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringBuilder()
                .append("* * * *")
                .append("*     *")
                .append("*     *")
                .append("* * * *")
                .toString()));
    }



}