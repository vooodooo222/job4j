package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter item name: ");
        Item[] items = tracker.findByName(name);
        if (items.length == 0) {
            System.out.println("So item not exist");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
        return true;
    }
}
