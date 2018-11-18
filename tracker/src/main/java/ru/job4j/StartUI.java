package ru.job4j;

/**
 * StartUI
 * author Shegai Evgenii(34shegai@gmail.com)
 */

public class StartUI {

    private final Input input;
    private final Tracker tracker;
    private static final String ADD = "0";
    private static final String SHOWALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDBYID = "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT = "6";

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт из  меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOWALL.equals(answer)) {
                this.showall();
            } else if (EDIT.equals(answer)) {
                this.edit();
            } else if (DELETE.equals(answer)) {
                this.delete();
            } else if (FINDBYID.equals(answer)) {
                this.findbyid();
            } else if (FINDBYNAME.equals(answer)) {
                this.findbyname();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void findbyname() {
        System.out.println("Найти заявку по имени");
        String name = this.input.ask("Введите имя заявки");
        System.out.println(" Заявки с данным именем - ");
        for (Item item : this.tracker.findByName(name)) {
            System.out.println(item.getName());
        }

    }

    private void findbyid() {
        System.out.println("Найти заявку по id");
        String id = this.input.ask("Введите id заявки");
        Item result = this.tracker.findById(id);
        if (result == null) {
            System.out.println("Заявка была удалена, либо изменена . Попробуйте найти заявку по имени");
        } else {
            System.out.println("Заявка с данным id " + result.getId() + " найдена");
        }
    }

    private void delete() {
        System.out.println("Удаление заявки");
        String id = this.input.ask("Введите id заявки");
        this.tracker.delete(id);
        System.out.println("Заявка удалена");
    }

    private void edit() {
        System.out.println("Редактирование заявки");
        String id = this.input.ask("Введите id заявки");
        String name = this.input.ask("Введите имя заявки");
        String desc = this.input.ask("Введите описание заявки");
        System.out.println("Введите дату создания заявки");
        long create = this.input.create();
        Item item = new Item(name, desc);
        this.tracker.replace(id, item);
        System.out.println("Заявка  добавлена");
    }

    private void showall() {
        System.out.println("Показываю все заявки");
        for (Item item : this.tracker.findAll()) {
            System.out.println("Имя заявки - " + item.getName() + " id заявки - " + item.getId());
        }
        System.out.println("Все заявки выведены на консоль");
    }

    private void createItem() {
        System.out.println("Добавление новой заявки");
        String name = this.input.ask("Введите имя заявки");
        String desc = this.input.ask("Введите описание заявки");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("Новая заявка с id" + item.getId() + "создана");
    }

    private void showMenu() {
        System.out.println("Пункты меню");
        System.out.println("Добавить заявку - 0");
        System.out.println("Показать все заявки - 1");
        System.out.println("Редактировать заявку - 2");
        System.out.println("Удалить заявку - 3");
        System.out.println("Найти заявку по id - 4");
        System.out.println("Найти заявку по имени - 5");
        System.out.println("Выйти из меню - 6");
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }


}
