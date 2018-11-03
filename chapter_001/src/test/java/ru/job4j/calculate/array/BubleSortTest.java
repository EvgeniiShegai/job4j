package ru.job4j.calculate.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BubleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubleSort sort = new BubleSort();
        int[] data = {5, 3, 2, 6, 7, 8, 9, 1, 0, 4};
        int[] res = sort.sort(data);
        int[] expect = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(res, is(expect));
    }

}