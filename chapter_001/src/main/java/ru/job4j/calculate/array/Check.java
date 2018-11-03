package ru.job4j.calculate.array;

public class Check {

    public boolean mono(boolean[] array) {
        boolean res = true;
        boolean temp = array[0];
        for (int i = 0; i < array.length; i++) {
          if (temp != array[i]) {
              res = false;
          }
        }
        return res;
    }
}
