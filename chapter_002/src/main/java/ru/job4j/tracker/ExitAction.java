package ru.job4j.tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "=== Exit program ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
