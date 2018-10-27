package ru.job4j.calculate.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void counter() {
        Counter counter = new Counter();
        int res = counter.add(0, 10);
        assertThat(res, is(30));
    }

}