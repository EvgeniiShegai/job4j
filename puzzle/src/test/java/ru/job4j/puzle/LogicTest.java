package ru.job4j.puzle;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void whenGorizontalWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(true));
    }

    @Test
    public void whenVerticalWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(true));
    }

    @Test
    public void whenNotWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][] {
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {1, 1, 0, 1, 1},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(false));
    }
}
