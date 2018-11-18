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

public class TriangleTest {

    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(new StringBuilder()
                .append("  *  ")
                .append(" * * ")
                .append("* * *")
                .toString()));
    }

}