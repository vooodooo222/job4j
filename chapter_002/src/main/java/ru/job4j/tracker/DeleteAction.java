package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item id: ");
        if (tracker.delete(id)) {
            System.out.print("Operation success." + System.lineSeparator());
        } else {
            System.out.print("Operation error." + System.lineSeparator());
        }
        return true;
    }
}
