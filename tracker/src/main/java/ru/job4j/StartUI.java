package ru.job4j;

/**
 * StartUI
 * author Shegai Evgenii(34shegai@gmail.com)
 */

public class StartUI {

    private final Input input;
    private final Tracker tracker;
    private int[] ranges;


    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
      MenuTracker menuTracker = new MenuTracker(this.input, this.tracker);
      menuTracker.fillActions();
      this.ranges = menuTracker.getActions();
      do {
          menuTracker.show();
          menuTracker.select(input.ask("Select", ranges));
      } while (!"y".equals(this.input.ask("Exit? y")));
    }

    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }


}
