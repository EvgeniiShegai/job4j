package ru.job4j;

/**
 * Tracker
 * author Shegai Evgenii(34shegai@gmail.com)
 */

import java.util.*;
import java.util.Arrays;

public class Tracker {

    private Item[] items = new Item[10];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generatId());
        this.items[this.position++] = item;
        return item;
    }

    public boolean replace(String id, Item item) {
        boolean res = false;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                item.setId(id);
                items[i] = item;
                res = true;
                break;
            }
        }
        return res;
    }


    public boolean delete(String id) {
       boolean result = false;
       for (int i = 0; i < position; i++) {
           if (items[i] != null && items[i].getId().equals(id)) {
               result = true;
               System.arraycopy(items, i + 1, items, i, position - i  - 1);
               position--;
               break;
           }
       }
       return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }


        public Item[] findByName(String key) {
            int index = 0;
            Item[] result = new Item[position];
            for (int i = 0; i < position; i++) {
                if (items[i] != null) {
                    if (items[i].getName().equals(key)) {
                        result[index++] = items[i];
                    }
                }
            }
            return Arrays.copyOf(result, index);

        }

        public Item findById(String id) {
            Item result = null;
            for (int i = 0; i < position; i++) {
                if (items[i].getId().equals(id)) {
                    result = items[i];
                    break;
                }
            }
            return result;
            }


        private String generatId() {
            return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
        }
    }

