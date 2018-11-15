package ru.job4j;

public class StubInput implements Input {


    @Override
    public String ask(String question) {
        return null;
    }

    @Override
    public long create() {
        return 0;
    }
}
