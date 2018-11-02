package ru.job4j.calculate.array;

public class ArrayChar {

    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    public boolean startWith(String prefix) {
        char[] temp = prefix.toCharArray();
        boolean result = true;
        for (int i = 0; i < temp.length; i++) {
            if (i <  data.length) {
                if (temp[i] != data[i]) {
                    return false;
                }
            }
        }

        return result;
    }
}
