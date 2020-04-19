package ru.job4j.tracker;

public class SortDescendingAction implements UserAction {
    @Override
    public String name() {
        return "=== Show sorted descending item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        tracker.sortDescending();
        return true;
    }
}
