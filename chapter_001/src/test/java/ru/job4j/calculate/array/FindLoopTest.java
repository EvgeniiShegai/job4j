package ru.job4j.calculate.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenHaveElement() {
        FindLoop findLoop = new FindLoop();
        int[] data = {1, 2, 3};
        int res = findLoop.indexOff(data, 2);
        assertThat(res, is(2));

    }

    @Test
    public void whenElementIsAbsent() {
        FindLoop findLoop = new FindLoop();
        int[] data = {1, 2, 3};
        int res = findLoop.indexOff(data, 4);
        assertThat(res, is(-1));

    }

}