package ru.job4j.calculate.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FactorialTest {

    @Test
    public void whenZero() {
        Factorial fact = new Factorial();
        int res = fact.calc(0);
        assertThat(res, is(1));
    }

    @Test
    public void whenFive() {
        Factorial fact = new Factorial();
        int res = fact.calc(5);
        assertThat(res, is(120));
    }

}