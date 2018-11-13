package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddItem() {
        Tracker tracker = new Tracker();
        long tmp = 11;
        Item item = new Item("One", "Test", tmp);
        Item temp = tracker.add(item);
        assertThat(tracker.findAll()[0], is(temp));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        long tmp = 11;
        long tmp2 = 12;
        Item item = new Item("One", "Test", tmp);
        Item temp = tracker.add(item);
        Item item2 = new Item("Two", "Test2", tmp2);
        tracker.replace(temp.getId(), item2);
        assertThat(tracker.findAll()[0], is(item2));
    }

    @Test
    public void whenFindAllItem() {
        Tracker tracker = new Tracker();
        long tmp = 11;
        long tmp2 = 12;
        Item item = new Item("One", "Test", tmp);
        Item temp = tracker.add(item);
        Item item2 = new Item("Two", "Test2", tmp2);
        Item temp2 = tracker.add(item2);
        Item[] expect = {temp, temp2};
        assertThat(tracker.findAll(), is(expect));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        long tmp = 11;
        long tmp3 = 13;
        Item item = new Item("One", "Test", tmp);
        Item temp = tracker.add(item);
        Item item2 = new Item("Three", "Test3", tmp3);
        Item temp2 = tracker.add(item2);
        Item[] result = tracker.findByName(temp2.getName());
        assertThat(result[0], is(temp2));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        long tmp = 11;
        long tmp3 = 13;
        Item item = new Item("One", "Test", tmp);
        Item temp = tracker.add(item);
        Item item2 = new Item("Three", "Test3", tmp3);
        Item temp2 = tracker.add(item2);
        Item result = tracker.findById(temp.getId());
        assertThat(result, is(temp));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        long tmp = 11;
        long tmp3 = 13;
        Item item = new Item("One", "Test", tmp);
        Item temp = tracker.add(item);
        Item item2 = new Item("Three", "Test3", tmp3);
        Item temp2 = tracker.add(item2);
        tracker.delete(temp.getId());
        assertThat(tracker.findAll()[0], is(temp2));
    }



}