package ru.job4j.calculate.loop;

public class Board {

    public String paint(int width, int height) {

        StringBuilder str = new StringBuilder();
        String separator = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        str.append("x");
                    } else {
                        str.append(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        str.append(" ");
                    } else {
                        str.append("x");
                    }
                }
            }
            str.append(separator);
        }
        return str.toString();
    }
}
