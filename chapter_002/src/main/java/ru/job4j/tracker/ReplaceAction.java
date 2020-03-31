package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item id: ");
        String name = input.askStr("Enter new item name: ");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            System.out.print("Operation success." + System.lineSeparator());
        } else {
            System.out.print("Operation error." + System.lineSeparator());
        }
        return true;
    }
}
