package ru.job4j.calculate.array;

/**
 * Calculate
 *@author Evgenii Shegai(34shegai@gmail.com)

 */

public class SortArray {

    private int[] data;

    public int[] array(int[] one, int[] two) {
        this.data = new int[one.length + two.length];
        one = swap(one);
        two = swap(two);
        return arrayFill(data, one, two);
    }

    /**
     * сортирует массив пузырьковой сортировкой
     * @param data
     * @return data
     */
    private int[] swap(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }

    private int[] arrayFill(int[] result, int[] array2, int[] array3) {
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < data.length; i++) {
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

