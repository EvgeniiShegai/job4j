package ru.job4j;

class EditItemByid implements UserAction {

    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = (input.ask("Please , enter the item id"));
        String name = input.ask("Please enter the items name");
        String desc = input.ask("Please enter the items description");
        Item item = new Item(name, desc);
        tracker.replace(id, item);
    }

    @Override
    public String info() {
        return String.format("%s, %s", this.key(), "Edit the  item by id");
    }
}

class FindItemByName implements UserAction {

    @Override
    public int key() {
        return 5;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = (input.ask("Please , enter the item name"));
        Item[] items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println("Items is found " + item.getName());
        }
    }

    @Override
    public String info() {
        return String.format("%s, %s", this.key(), "item  by name is found");
    }
}

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[6];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new EditItemByid();
        this.actions[3] =  new MenuTracker.DeleteItem();
        this.actions[4] =  new FindItem();
        this.actions[5] = new FindItemByName();
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {

        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
           String name = input.ask("Please enter the items name");
           String desc = input.ask("Please enter the items description");
           tracker.add(new Item(name, desc));
        }

        @Override
        public String info() {
            return String.format("%s, %s", this.key(), "Add the new item");
        }
    }

    private class DeleteItem implements UserAction {

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.delete(input.ask("Please enter the id"));

        }

        @Override
        public String info() {
            return String.format("%s, %s", this.key(), "Delete the  item");
        }
    }

    private static class ShowItems implements UserAction {

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
           for (Item item : tracker.findAll()) {
               System.out.println(String.format("%s, %s", item.getName(), item.getId()));
           }
        }

        @Override
        public String info() {
            return String.format("%s, %s", this.key(), "Show all items");
        }
    }

    private static class FindItem implements UserAction {

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the item id");
             Item item = tracker.findById(id);
            System.out.println("Item is found " + item.getId());
        }

        @Override
        public String info() {
            return String.format("%s, %s", this.key(), "Item  by id is found");
        }
    }
}
