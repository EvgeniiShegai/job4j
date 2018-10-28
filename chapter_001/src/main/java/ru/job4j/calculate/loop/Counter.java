package ru.job4j.calculate.loop;

public class Counter {

    public int add(int start, int finish) {
        int res = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }
        return res;
    }
}
