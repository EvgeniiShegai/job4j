package ru.job4j.calculate.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenArrayTrue() {
        Check check = new Check();
        boolean[] array = {true, true, true};
        boolean res = check.mono(array);
        assertThat(res, is(true));
    }

    @Test
    public void whenArrayFalse() {
        Check check = new Check();
        boolean[] array = {true, true, false};
        boolean res = check.mono(array);
        assertThat(res, is(false));
    }
}