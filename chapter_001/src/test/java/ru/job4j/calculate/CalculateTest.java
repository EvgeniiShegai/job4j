package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Evgenii Shegai (34shegai@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
    /**
     * Test echo.
     */
    @Test
    public void whenAddOneplusOneThenTwo() {
       Calculate calc = new Calculate();
       calc.add(1D,1D);
       double expect = 2D;
       assertThat(calc.getResult(),is (expect));
    }

    @Test
    public void whenSubtractOneAndOneThenZero(){
        Calculate calc = new Calculate();
        calc.subtract(1D,1D);
        double expect = 0.0;
        assertThat(calc.getResult(),is (expect));
    }

    @Test
    public void whenDivOneAndOneThenOne(){
        Calculate calc = new Calculate();
        calc.div(1D,1D);
        double expect = 1D;
        assertThat(calc.getResult(),is (expect));
    }

    @Test
    public void whenMultipleOneAndOneThenOne(){
        Calculate calc = new Calculate();
        calc.multiple(1D,1D);
        double expect = 1D;
        assertThat(calc.getResult(),is (expect));
    }

}