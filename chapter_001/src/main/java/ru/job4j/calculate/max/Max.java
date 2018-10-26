package ru.job4j.calculate.max;

public class Max {

    public int max(int first, int second) {
        if (first == second) {
            return first;
        }
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {

        return max(third, max(first, second));
    }
}
