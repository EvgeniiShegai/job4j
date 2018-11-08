package ru.job4j.calculate.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortArrayTest {

    @Test
    public void whenTwoMassive() {
        SortArray sort = new SortArray();
        int[] one = {2, 1};
        int[] two = {3, 4};
        int[] expect = {1, 2, 3, 4};
        int[] result = sort.array(one, two);
        assertThat(result, is(expect));
    }


    @Test
    public void whenTwoMassive2() {
        SortArray sort = new SortArray();
        int[] one = {2, 1, 5};
        int[] two = {3, 4};
        int[] expect = {1, 2, 3, 4, 5};
        int[] result = sort.array(one, two);
        assertThat(result, is(expect));
    }
}