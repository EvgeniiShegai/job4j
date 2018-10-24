package ru.job4j.calculate.converter;

public class Converter {

    public int rubInEuro(int value) {
        return value / 70;
    }

    public int rubInDollar(int value) {
        return value / 60;
    }

    public int euroInRub(int value) {
        return 70 * value;
    }

    public int dollarInRub(int value) {
        return 60 * value;
    }
}
