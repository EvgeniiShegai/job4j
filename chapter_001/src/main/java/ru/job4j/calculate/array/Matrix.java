package ru.job4j.calculate.array;

/**
 * Matrix
 *@author Evgenii Shegai(34shegai@gmail.com)
 */

public class Matrix {

    public int[][] multiple(int size) {
        int[][] data = new int[size][size];
         for (int i = 0; i < size; i++) {
             for (int j = 0; j < size; j++) {
                 data[i][j] = (i + 1) * (j + 1);
             }
         }
        return data;
    }
}
