package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test ", "desc", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test "));
    }

    @Test
    public void whenAddAndThenreplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"5", item.getId(), "test replace", "заменили заявку", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));

    }

    @Test
    public void whenFindItemById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "desc"));
        Input input = new StubInput(new String[] {"3", item.getId(), "y"});
        new StartUI(input, tracker).init();
        Item result = tracker.findById(item.getId());
        assertThat(result.getId(), is(item.getId()));
    }

    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "desc"));
        Item item2 = tracker.add(new Item("test2", "desc2"));
        Input input = new StubInput(new String[] {"4", "test2", "y"});
        new StartUI(input, tracker).init();
        Item[] result = tracker.findByName("test2");
        assertThat(result[0].getName(), is(item2.getName()));
    }

    @Test
    public void whenAddItemAndDelete() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "desc"));
        Item item2 = tracker.add(new Item("test2", "desc2"));
        Input input = new StubInput(new String[] {"2", item.getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is(item2.getName()));
    }



}