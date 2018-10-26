package ru.job4j.calculate.max;

public class Max {

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        int res = this.max(temp, third);
        return res;
    }
}
