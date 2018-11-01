package ru.job4j.calculate.array;

public class FindLoop {

    public int indexOff(int[] data, int e1) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == e1) {
                result = data[i];
                break;
            }
        }
        return result;
    }
}
