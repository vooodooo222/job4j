package ru.job4j.tracker;

import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.List;

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
        List<Item> result = tracker.findAll();
        assertThat(result.get(0).getName(), is(item1.getName()));
        assertThat(result.get(1).getName(), is(item2.getName()));
        assertThat(result.get(2).getName(), is(item3.getName()));
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
        List<Item> result = tracker.findByName("test2");
        assertThat(result.get(0).getName(), is(test2));
        assertThat(result.get(1).getName(), is(test2));
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
        Item bug1 = new Item("Bug1");
        Item bug2 = new Item("Bug2");
        Item bug3 = new Item("Bug3");
        tracker.add(bug1);
        tracker.add(bug2);
        tracker.add(bug3);
        String id = bug2.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
        assertThat(tracker.findByName("Bug3").get(0), is(bug3));
        assertThat(tracker.getItemsCount(), is(2));
    }

    @Test
    public void whenSortedAscending() {
        Tracker tracker = new Tracker();
        Item c = new Item("C");
        Item a = new Item("A");
        Item b = new Item("B");
        tracker.add(c);
        tracker.add(a);
        tracker.add(b);
        tracker.sortAscending();
        List<Item> list = tracker.findAll();
        assertThat(list.get(0).getName(), is(a.getName()));
        assertThat(list.get(1).getName(), is(b.getName()));
        assertThat(list.get(2).getName(), is(c.getName()));
    }

    @Test
    public void whenSortedDescending() {
        Tracker tracker = new Tracker();
        Item a = new Item("A");
        Item c = new Item("C");
        Item b = new Item("B");
        tracker.add(a);
        tracker.add(c);
        tracker.add(b);
        tracker.sortDescending();
        List<Item> list = tracker.findAll();
        assertThat(list.get(0).getName(), is(c.getName()));
        assertThat(list.get(1).getName(), is(b.getName()));
        assertThat(list.get(2).getName(), is(a.getName()));
    }
}