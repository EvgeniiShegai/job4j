package ru.job4j;



import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.println(question);
        String temp = scanner.next();
        return temp;
    }

    @Override
    public long create() {
        long result = scanner.nextLong();
        return result;
    }
}
