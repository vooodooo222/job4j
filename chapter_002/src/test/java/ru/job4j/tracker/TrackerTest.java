package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAdd3NewItemsThenTrackerHasSameItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] result = tracker.findAll();
        assertThat(result[0].getName(), is(item1.getName()));
        assertThat(result[1].getName(), is(item2.getName()));
        assertThat(result[2].getName(), is(item3.getName()));
    }

    @Test
    public void whenAdd4NewItemsWith2SameItemsThenTrackerHasThis2SameItem() {
        Tracker tracker = new Tracker();
        String test2 = "test2";
        Item item1 = new Item("test1");
        Item item2 = new Item(test2);
        Item item3 = new Item("test3");
        Item item22 = new Item(test2);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item22);
        Item[] result = tracker.findByName("test2");
        assertThat(result[0].getName(), is(test2));
        assertThat(result[1].getName(), is(test2));
    }

    @Test
    public void whenAddNewItemsOneOfWhichWithId44ThenTrackerHasFindThisItemById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item result = tracker.findById(item3.getId());
        assertThat(result.getId(), is(item3.getId()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String bugId = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(bugId, bugWithDesc);
        assertThat(tracker.findById(bugId).getName(), is("Bug with description"));
        assertThat(tracker.findById(bugId).getId(), is(bugWithDesc.getId()));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}