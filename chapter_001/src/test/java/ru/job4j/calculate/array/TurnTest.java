package ru.job4j.calculate.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void turnMassiveOne() {
        Turn turn = new Turn();
        int[] data = {1, 2, 3, 4, 5};
        int[] result = turn.back(data);
        int[] expect = {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void turnMassiveTwo() {
        Turn turn = new Turn();
        int[] data = {1, 2, 3, 4};
        int[] result = turn.back(data);
        int[] expect = {4, 3, 2, 1};
        assertThat(result, is(expect));
    }

}