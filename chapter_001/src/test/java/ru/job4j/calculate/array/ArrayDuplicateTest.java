package ru.job4j.calculate.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] data = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expect = {"Привет", "Мир", "Супер"};
        String[] result = duplicate.remove(data);
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveAllDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] data = {"Привет", "Привет", "Привет"};
        String[] expect = {"Привет"};
        String[] result = duplicate.remove(data);
        assertThat(result, is(expect));
    }

}