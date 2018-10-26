package ru.job4j.calculate.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void maxFromTwoNumbers() {
        Max max = new Max();
        int res = max.max(1, 2);
        assertThat(res, is(2));
    }

    @Test
    public void maxFromThreeNumbers() {
        Max max = new Max();
        int res = max.max(1, 2, 3);
        assertThat(res, is(3));
    }
}