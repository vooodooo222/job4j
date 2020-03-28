package ru.job4j.tracker;

/**
 * Меню трекера
 * author Vladimir Aleksandrov
 */
public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr(""));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter item name: ");
                String name = input.askStr("=== Create a new Item ====" + System.lineSeparator()
                                                  + "Enter item name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    item.print();
                }
            } else if (select == 2) {
                String id = input.askStr("Enter item id: ");
                String name = input.askStr("Enter new item name: ");
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.print("Operation success." + System.lineSeparator());
                } else {
                    System.out.print("Operation error." + System.lineSeparator());
                }
            } else if (select == 3) {
                String id = input.askStr("Enter item id: ");
                if (tracker.delete(id)) {
                    System.out.print("Operation success." + System.lineSeparator());
                } else {
                    System.out.print("Operation error." + System.lineSeparator());
                }
            } else if (select == 4) {
                String id = input.askStr("Enter item id: ");
                Item item = tracker.findById(id);
                print(item);
            } else if (select == 5) {
                String name = input.askStr("Enter item name: ");
                Item[] items = tracker.findByName(name);
                print(items);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item" + System.lineSeparator()
                         + "1. Show all items" + System.lineSeparator()
                         + "2. Edit item" + System.lineSeparator()
                         + "3. Delete item" + System.lineSeparator()
                         + "4. Find item by Id" + System.lineSeparator()
                         + "5. Find items by name" + System.lineSeparator()
                         + "6. Exit Program" + System.lineSeparator()
                         + "Select:");
    }

    private void print(Item item) {
        if (item != null) {
            item.print();
        } else {
            System.out.println("So item not exist");
        }
    }

    private void print(Item[] items) {
        if (items == null) {
            System.out.println("So items not exist");
        } else {
            if (items.length == 0) {
                System.out.println("So item not exist");
            } else {
                for (Item item : items) {
                    if (item == null) {
                        System.out.println("So item not exist");
                    } else {
                        item.print();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
