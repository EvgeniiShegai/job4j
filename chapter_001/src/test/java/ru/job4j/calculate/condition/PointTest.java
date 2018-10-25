package ru.job4j.calculate.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distanceBetweenTwoPoints() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double res = a.distanceTo(b);
        assertThat(res, closeTo(4.5, 0.1));
    }

}