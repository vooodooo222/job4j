package ru.job4j.tracker;

public class SortAscendingAction implements UserAction {
    @Override
    public String name() {
        return "=== Show sorted ascending item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        tracker.sortAscending();
        return true;
    }
}
