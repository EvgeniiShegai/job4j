package ru.job4j.calculate.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortArrayTest {

    @Test
    public void whenTwoMassive() {
        SortArray sort = new SortArray();
        int[] two = {3, 7, 8, 9, 10};
        int[] one = {1, 3, 5, 7, 13};
        int[] expect = {1, 3, 3, 5, 7, 7, 8, 9, 10, 13};
        int[] result = sort.arrayFill(one, two);
        assertThat(result, is(expect));
    }


    @Test
    public void whenTwoMassive2() {
        SortArray sort = new SortArray();
        int[] one = {1, 2, 5};
        int[] two = {3, 4};
        int[] expect = {1, 2, 3, 4, 5};
        int[] result = sort.arrayFill(one, two);
        assertThat(result, is(expect));
    }
}