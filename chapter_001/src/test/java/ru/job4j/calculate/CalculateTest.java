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
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Evgenii Shegai";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
    String expect = "Echo, echo, echo : Evgenii Shegai";
    assertThat(result, is(expect));
}
 
}