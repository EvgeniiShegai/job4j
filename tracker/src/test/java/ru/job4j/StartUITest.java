package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test ", "desc", "10", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test "));
    }

    @Test
    public void whenAddAndThenreplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "desc", 11));
        Input input = new StubInput(new String[] {"2", item.getId(), "test2", "desc2", "12", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test2"));
    }

    @Test
    public void whenFindItemById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "desc", 11));
        Item item2 = tracker.add(new Item("test2", "desc2", 111));
        Item result = tracker.findById(item2.getId());
        assertThat(result.getId(), is(item2.getId()));
    }

    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "desc", 11));
        Item item2 = tracker.add(new Item("test2", "desc2", 111));
        Item[] result = tracker.findByName(item2.getName());
        assertThat(result[0].getName(), is(item2.getName()));
    }

    @Test
    public void whenAddItemAndDelete() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "desc", 11));
        Item item2 = tracker.add(new Item("test2", "desc2", 111));
        tracker.delete(item.getId());
        assertThat(tracker.findAll()[0].getName(), is(item2.getName()));
    }

}