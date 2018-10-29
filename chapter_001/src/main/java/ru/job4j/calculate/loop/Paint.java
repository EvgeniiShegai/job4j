package ru.job4j.calculate.loop;


/**
 * @author Shegai Evgenii (34shegai@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Paint {

    StringBuilder str = new StringBuilder();
    String separator = System.lineSeparator();

    public String rightTrl(int height) {

        StringBuilder screen = new StringBuilder();
        int weight = height;

        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String piramid(int height) {

        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    str.append("^");
                } else {
                    str.append(" ");
                }
            }
            str.append(separator);
        }
        System.out.println(str);
       return str.toString();
    }


}
