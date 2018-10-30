package ru.job4j.calculate.array;

public class Square {

    public int[] calculate(int bound) {
        int count = 1;
        int[] res = new int[bound];
        for (int i = 0; i < res.length; i++) {
            res[i] = count * count;
            if (count <= bound) {
                count++;
            }
        }
        return res;
    }
}
