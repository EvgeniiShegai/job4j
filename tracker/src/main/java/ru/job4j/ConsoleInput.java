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
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
         for (int temp : range) {
            if (temp == key) {
            exist = true;
            break;
           }
         }
        if (exist) {
        return key;
        } else {
            throw new MenuOutException("Out of menu range");
        }
    }
}
