package ru.job4j.calculate.condition;

/**
 * @author Evgenii Shegai(34shegai@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class DummyBot {

    private String res;

    public String answer(String question) {
        if (question.equals("Привет Бот")) {
            res = "Привет умник";
        }  else if (question.equals("Пока")) {
            res = "До скорой встречи";
        } else {
            res = "Это ставит меня в тупик - спросите другой вопрос";
        }
        return res;
    }

}
