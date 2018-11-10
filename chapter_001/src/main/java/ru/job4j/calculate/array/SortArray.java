package ru.job4j.calculate.array;

/**
 * SortArray
 *@author Evgenii Shegai(34shegai@gmail.com)

 */

public class SortArray {


    public int[] arrayFill(int[] array2, int[] array3) {
       int[] result = new int[array2.length + array3.length];
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (index >= array2.length) {
                result[i] = array3[index];
                break;
            } else if (index2 >= array3.length) {
                result[i] = array2[index];
                break;
            }
            if (array2[index] < array3[index2]) {
                result[i] = array2[index++];

            } else {
                result[i] = array3[index2++];
            }
        }
        return result;
    }
}

