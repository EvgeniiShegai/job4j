package ru.job4j;

class FindItemByid implements UserAction {

    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = (input.ask("Please , enter the item id"));
        Item result = tracker.findById(id);
        try {
            String name = result.getName();
            System.out.println("Item is found " + name);
        } catch (NullPointerException npe) {
            System.out.println("Please enter the valid id");
        }

    }

    @Override
    public String info() {
        return String.format("%s, %s", this.key(), "Find   item by id");
    }
}

class FindItemByName implements UserAction {

    @Override
    public int key() {
        return 4;
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

    public int[] getActions() {
        int[] ranges = new int[actions.length];
        int i = 0;
        for (UserAction action : actions) {
            ranges[i++] = action.key();
        }
        return ranges;
    }

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] =  new MenuTracker.DeleteItem();
        this.actions[3] =  new FindItemByid();
        this.actions[4] = new FindItemByName();
        this.actions[5] = new ReplaceItem();
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

    private class ReplaceItem implements UserAction {

        private boolean res = false;

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
           String id = input.ask("Please enter the id");
           String name = input.ask("Please enter the items name");
           String desc = input.ask("Please enter the description item");
           res = tracker.replace(id, new Item(name, desc));
        }

        @Override
        public String info() {
            return String.format("%s, %s, %s", this.key(), "Replace the item - ", this.res);
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
        private boolean res = false;

        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
           res = tracker.delete(input.ask("Please enter the id"));

        }

        @Override
        public String info() {
            return String.format("%s, %s,%s", this.key(), "Delete the  item -", this.res);
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


}
