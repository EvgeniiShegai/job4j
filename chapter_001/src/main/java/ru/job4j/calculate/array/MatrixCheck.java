package ru.job4j.calculate.array;

public class MatrixCheck {

    public boolean mono(boolean[][] array) {
        boolean res = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i][i] != array[i + 1][i + 1]) {
                res = false;
                break;
            } else if (array[i][array.length - 1 - i] != array[i + 1][array.length - 2 - i]) {
                res = false;
                break;
            }
        }
        return res;
    }
}
