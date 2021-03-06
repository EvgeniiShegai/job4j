package ru.job4j.calculate.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }

    @Test
    public void whenFirstNotSecond() {
        ArrayChar word = new ArrayChar("Hi");
        boolean result = word.startWith("Hello");
        assertThat(result, is(false));
    }

    @Test
    public void whenTrue() {
        ArrayChar word = new ArrayChar("He");
        boolean result = word.startWith("Hello");
        assertThat(result, is(true));
    }

}