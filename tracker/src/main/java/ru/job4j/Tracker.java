package ru.job4j;

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

    public void replace(String id, Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = item;
                break;
            }
        }
    }


    public void delete(String id) {
        int length = items.length;
       for (int i = 0; i < items.length; i++) {
           if (items[i] != null && items[i].getId().equals(id)) {
               System.arraycopy(items, i + 1, items, i, length - i  - 1);
           }
       }
    }

    public Item[] findAll() {
        int index = 0;
        int length = items.length;
        Item[] result = new Item[length];
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                result[index++] = items[i];
            } else {
                length--;
            }
        }
        return Arrays.copyOf(items, length);
    }


        public Item[] findByName(String key) {
            int index = 0;
            int length = items.length;
            Item[] result = new Item[length];
            for (int i = 0; i < items.length; i++) {
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
            for (Item temp : items) {
                if (temp.getId().equals(id)) {
                    result = temp;
                    break;
                }
            }
            return result;
        }

        private String generatId() {
            return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
        }
    }

