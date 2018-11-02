package ru.job4j.calculate.array;

public class Check {

    public boolean mono(boolean[] array) {


        for (int i = 0; i < array.length; i++) {
            boolean temp = array[0];
          if (temp != array[i]) {
              return false;
          }

        }
        return true;
    }
}
