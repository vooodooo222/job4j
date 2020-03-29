package ru.job4j.tracker;

/**
 * Trackers menu
 * author Vladimir Aleksandrov
 */
public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr(""));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private static void findItemByName(Input input, Tracker tracker) {
        String name = input.askStr("Enter item name: ");
        Item[] items = tracker.findByName(name);
        print(items);
    }

    private static void findItemById(Input input, Tracker tracker) {
        String id = input.askStr("Enter item id: ");
        Item item = tracker.findById(id);
        print(item);
    }

    private static void deleteItem(Input input, Tracker tracker) {
        String id = input.askStr("Enter item id: ");
        if (tracker.delete(id)) {
            System.out.print("Operation success." + System.lineSeparator());
        } else {
            System.out.print("Operation error." + System.lineSeparator());
        }
    }

    private static void replaceItem(Input input, Tracker tracker) {
        String id = input.askStr("Enter item id: ");
        String name = input.askStr("Enter new item name: ");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            System.out.print("Operation success." + System.lineSeparator());
        } else {
            System.out.print("Operation error." + System.lineSeparator());
        }
    }

    private static void findAllItems(Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            item.print();
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter item name: ");
        Item item = new Item(name);
        tracker.add(item);
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

    private static void print(Item item) {
        if (item != null) {
            item.print();
        } else {
            System.out.println("So item not exist");
        }
    }

    private static void print(Item[] items) {
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
