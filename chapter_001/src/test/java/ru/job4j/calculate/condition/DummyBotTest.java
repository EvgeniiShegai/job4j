package ru.job4j.calculate.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenHiBot() {
        DummyBot bot = new DummyBot();
        String res = bot.answer("Привет Бот");
        String except = "Привет умник";
        assertThat(res, is(except));
    }

    @Test
    public void whenByBot() {
        DummyBot bot = new DummyBot();
        String res = bot.answer("Пока");
        String except = "До скорой встречи";
        assertThat(res, is(except));
    }


    @Test
    public void whenUknowBot() {
        DummyBot bot = new DummyBot();
        String res = bot.answer("Сколько будет 2 + 2");
        String except = "Это ставит меня в тупик - спросите другой вопрос";
        assertThat(res, is(except));
    }
}