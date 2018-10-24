package ru.job4j.calculate.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    @Test
    public void whenRubInEuro() {
        Converter converter = new Converter();
        int res = converter.rubInEuro(70);
        int expect = 1;
        assertThat(res, is(expect));
    }

    @Test
    public void rubInDollar() {
        Converter converter = new Converter();
        int res = converter.rubInDollar(60);
        int expect = 1;
        assertThat(res, is(expect));
    }

    @Test
    public void euroInRub() {
        Converter converter = new Converter();
        int res = converter.euroInRub(1);
        int expect = 70;
        assertThat(res, is(expect));
    }

    @Test
    public void dollarInRub() {
        Converter converter = new Converter();
        int res = converter.dollarInRub(1);
        int expect = 60;
        assertThat(res, is(expect));
    }

}