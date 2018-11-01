package ru.job4j.calculate.array;

public class Check {

    public boolean mono(boolean[] array) {
        boolean res = false;
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                count++;
            } else if (array[i]) {
                count2++;
            }
        }
        if (count == array.length || count2 == array.length) {
            res = true;
        }
        return res;
    }
}
