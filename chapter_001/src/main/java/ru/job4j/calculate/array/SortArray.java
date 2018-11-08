package ru.job4j.calculate.array;

/**
 * Calculate
 *@author Evgenii Shegai(34shegai@gmail.com)

 */

public class SortArray {

    private int[] data;

    public int[] array(int[] one, int[] two) {
        this.data = new int[one.length + two.length];
         data = arrayFill(data, one, two);
          return swap(data);
        }

    /**
     * сортирует массив пузырьковой сортировкой нe содержит дубликаты
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
            for (int i = 0; i < data.length; i++) {
                if (i < array2.length) {
                    data[i] = array2[i];
                } else {
                    data[i] = array3[index++];
                }
            }
            return result;
        }
    }

