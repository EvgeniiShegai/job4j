package ru.job4j.calculate.array;

/**
 * ArrayDuplicate
 *@author Evgenii Shegai(34shegai@gmail.com)
 */

import java.util.Arrays;

public class ArrayDuplicate {

    /**
     *
     * @param data
     * @return Arrays.copy
     */

    public String[] remove(String[] data) {
        int unique = data.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (data[out].equals(data[in])) {
                    data[in] = data[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(data, unique);
    }
}
