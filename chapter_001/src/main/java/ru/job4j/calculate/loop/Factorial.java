package ru.job4j.calculate.loop;


public class Factorial {

    public int calc(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
