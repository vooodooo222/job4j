package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter item name: ");
        List<Item> items = tracker.findByName(name);
        if (items.size() == 0) {
            System.out.println("So item not exist");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
        return true;
    }
}
